var previous = null;
document.getElementById("gender").onclick = getInfo;

function getInfo(e){
    var countryCode = e.target.id;
    var country = e.target;
    country.style.fill = "red";
    if(previous === null){
        previous = country;
    }else{
        previous.style.fill="#c0c0c0"
        previous = country;
    }
    console.log(countryCode);
    var url = "http://uinames.com/api/?";
    url += countryCode;
    fetch(url)
        .then(res => res.json())
        .then(function(data){
            var output = `
            Country: ${data[0].name} <br>
            Population: ${data[0].population} <br>
            Area: ${data[0].area} <br>
            Borders: ${data[0].borders} 
            `;
            document.getElementById("information").innerHTML = output;
        }).catch(err => console.log("Ups, something went wrong: " + err));
    
}
