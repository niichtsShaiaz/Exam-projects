package com.mycompany.objectrelationalmappnig.orm;

import com.mycompany.objectrelationalmappnig.orm.ItemType;
import com.mycompany.objectrelationalmappnig.orm.Orderr;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-11T18:41:36")
@StaticMetamodel(OrderLine.class)
public class OrderLine_ { 

    public static volatile SingularAttribute<OrderLine, ItemType> itemType;
    public static volatile SingularAttribute<OrderLine, Long> id;
    public static volatile SingularAttribute<OrderLine, Integer> quanitiy;
    public static volatile SingularAttribute<OrderLine, Orderr> order;

}