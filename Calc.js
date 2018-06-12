document.getElementById("buttons").onclick = getNumber;
var display = document.getElementById("display");
var tmp = 0;
var lastop;
var q = false;

function getNumber(event)
{
    
    var btn = event.target.innerHTML;
    if (btn === "+") {
        tmp = display.innerText;
        lastop = "+";
        display.innerText += "+";
        q = false;
        console.log(tmp);
    }
    if (btn === "-") {
        tmp = display.innerText;
        lastop = "-";
        display.innerText += "-";
        q = false;
        console.log(tmp);
    }

    if (btn === "*") {
        tmp = display.innerText;
        lastop = "*";
        display.innerText += "*";
        q = false;
        console.log(tmp);
    }
    if (btn === "/") {
        tmp = display.innerText;
        lastop = "/";
        display.innerText += "/";
        q = false;
        console.log(tmp);
    }

    if (btn === "=") {
        
        q = true;
        display.innerText = parseFloat(eval(display.innerText));
        /*switch (lastop) {
            case "+":
                var num2 =display.innerText.split("+");
                res = parseFloat(tmp) + parseFloat(num2[1]);
                break;

            case "-":
                var num2 =display.innerText.split("-");
                res = parseFloat(tmp) - parseFloat(num2[1]);
                break;

            case "*":
                var num2 =display.innerText.split("*");
                res = parseFloat(tmp) * parseFloat(num2[1]);
                break;

            case "/":
                var num2 =display.innerText.split("/");
                res = parseFloat(tmp) / parseFloat(num2[1]);
                break;
        }*/
    }
    
    if (btn === "9")
        if(q === false)
        display.innerText += btn;
        else{
            display.innerText = btn;
            q = false;
    }

    if (btn === "8")
         if(q === false)
        display.innerText += btn;
        else{
            display.innerText = btn;
            q = false;
    }

    if (btn === "7")
         if(q === false)
        display.innerText += btn;
        else{
            display.innerText = btn;
            q = false;
    }

    if (btn === "6")
         if(q === false)
        display.innerText += btn;
        else{
            display.innerText = btn;
            q = false;
    }

    if (btn === "5")
         if(q === false)
        display.innerText += btn;
        else{
            display.innerText = btn;
            q = false;
    }

    if (btn === "4")
         if(q === false)
        display.innerText += btn;
        else{
            display.innerText = btn;
            q = false;
    }

    if (btn === "3")
         if(q === false)
        display.innerText += btn;
        else{
            display.innerText = btn;
            q = false;
    }

    if (btn === "2")
         if(q === false)
        display.innerText += btn;
        else{
            display.innerText = btn;
            q = false;
    }

    if (btn === "1")
         if(q === false)
        display.innerText += btn;
        else{
            display.innerText = btn;
            q = false;
    }

    if (btn === "0")
         if(q === false)
        display.innerText += btn;
        else{
            display.innerText = btn;
            q = false;
    }
    
    if (btn === ".")
         if(q === false)
        display.innerText += btn;
        else{
            display.innerText = btn;
            q = false;
    }

}