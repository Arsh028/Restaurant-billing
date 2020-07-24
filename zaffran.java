import java.io.*;
public class ZAFFRAN
{/*# start of class Zaffran*/
    InputStreamReader a = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader (a);
    int cf;
    int subcf1;
    double price=0.0;
    double tax=0.0;
    int quantity=0;
    int d;
    int lastd;
    int abc;
    int qty[]=new int[10000];
    double price1[]= new double[10000];
    String item[]=new String[10000];
    double tax1[]=new double[10000];
    int k;
    public void print1()
    {/*#a meathod to print zaffran menu*/
        System.out.println("\t\t\t\t    ZAFFRAN RESTAURANT");
        System.out.println("\t\t\t\t    ``````` ``````````");
        System.out.println("");
        System.out.println("");
        System.out.println("\t\t\tMENU");
        System.out.println("\t\t\t````");
        System.out.println("");
        System.out.println("\t I] SOUPS\t\t\t\t\t\tPRICE");
        System.out.println("\t    `````\t\t\t\t\t\t`````");
        System.out.println(""); 
        System.out.println("1)safed tamatar aur tulsi ka shorba\t\t\t\t150");
        System.out.println("");
        System.out.println("2)tomato dhania shorba\t\t\t\t\t\t150");
        System.out.println(" (broth of garden tomato with mustard)");
        System.out.println("");
        System.out.println("3)dum murg shorba\t\t\t\t\t\t175");
        System.out.println("  (broth of chickenn flavoured with pepercorn)"); 
        System.out.println("");
        System.out.println("4)Murg Zaffrani Shorba\t\t\t\t\t\t175");
        System.out.println("  (gently simmered chicken broth flavoured with pepper)");
        System.out.println("");
        System.out.println("");
        System.out.println("______________________________________________________________________________________________________________________________________________"); 
    }//end of meathod print1

    public void print2()
    {//start of print2 meathod
        System.out.println("\t II] STARTERS(VEG)\t\t\t\t\t\tPRICE");
        System.out.println("\t     `````````````\t\t\t\t\t\t`````");
        System.out.println("");
        System.out.println("1)Achari paneer tikka\t\t\t\t\t\t\t293");
        System.out.println("  (cubes of cottage cheese marinated with mint)");
        System.out.println("");
        System.out.println("2)Paneer tikka\t\t\t\t\t\t\t\t268");
        System.out.println("  (cubes of cottage cheese marinated with mint)");
        System.out.println("");
        System.out.println("3)Pudhina paneer tikka\t\t\t\t\t\t\t231");
        System.out.println("  (cubes of cottage cheese marinated mildy in yoghurt)");
        System.out.println("");
        System.out.println("4)Tandoori mushroom cheese melt\t\t\t\t\t\t341");
        System.out.println("  (mushroom smoked in a clay oven,topped with cheddar)");
        System.out.println("");
        System.out.println("5)Tandoori broccoli\t\t\t\t\t\t\t295");
        System.out.println("  (broccoli florets marinated in yoghurt and cooked in tandoor)");
        System.out.println("");
        System.out.println("6)Vegetable galouti kabab\t\t\t\t\t\t275");
        System.out.println("  (vegetarian version of famous 'melt in your mouth'kabab)");
        System.out.println("");
        System.out.println("7)Chilli cheese pakoras\t\t\t\t\t\t\t295");
        System.out.println("  (Zaffran signature nanlets)");
        System.out.println(""); 
        System.out.println("8)Zaffran signature nananlets\t\t\t\t\t\t455");
        System.out.println("  (our version canapes)"); 
        System.out.println(""); 
        System.out.println(""); 
        System.out.println("__________________________________________________________________________________________________________________________________________________"); 
    }//end of meathod print2

    public void print3()
    {//start of meathod print3
        System.out.println("\t III] STARTERS(NON-VEG)\t\t\t\t\t\tPRICE");
        System.out.println("\t      ```````````````` \t\t\t\t\t\t`````");
        System.out.println("");
        System.out.println("1)Tandoori murg\t\t\t\t\t\t\t\t335");
        System.out.println("  (tandoori murg topped with chillies and red sauce)");
        System.out.println("2)Murg chello kabab\t\t\t\t\t\t\t315"); 
        System.out.println("  (murg tika topped with rice and cream)");
        System.out.println(""); 
        System.out.println("3)Murg kalmi kabab\t\t\t\t\t\t\t315");
        System.out.println("  (chicken drumsticks with cashew and sauce)");
        System.out.println("");
        System.out.println("4)Murg tikka\t\t\t\t\t\t\t\t375");
        System.out.println("  (boneless pieces of chicken in a robust sauce)");
        System.out.println("");
        System.out.println("5)Murg haiyali tikka\t\t\t\t\t\t\t475");
        System.out.println("  (boneless pieces of chicken with green sauce)");
        System.out.println("");
        System.out.println("6)Murg kalimirch tikka\t\t\t\t\t\t\t316");
        System.out.println("  (boneless chicken in brown onion)");
        System.out.println("");
        System.out.println("7)Tandoor promfret\t\t\t\t\t\t\t675");
        System.out.println("  (a whole promfet marinated and roasted)"); 
        System.out.println("");
        System.out.println("8)Tandoori prawns\t\t\t\t\t\t\t626");
        System.out.println("  (prawns marinated with tender leaves)");
        System.out.println(""); 
        System.out.println(""); 
        System.out.println("__________________________________________________________________________________________________________________________________________________"); 
    }//end of meathod print3

    public void print4()
    {//start of meathod print4
        System.out.println("\t IV] RICE\t\t\t\t\t\tPRICE");
        System.out.println("\t     ````\t\t\t\t\t\t`````");
        System.out.println("");
        System.out.println("1)Sules biryani\t\t\t\t\t\t\t325"); 
        System.out.println(""); 
        System.out.println("2)Dal khichdi\t\t\t\t\t\t\t225");
        System.out.println("");
        System.out.println("3)Broccoli dal khichdi\t\t\t\t\t\t664");
        System.out.println("");
        System.out.println("4)Murg biryani\t\t\t\t\t\t\t256"); 
        System.out.println("");
        System.out.println("5)Murg tikka biryani\t\t\t\t\t\t426");
        System.out.println("");
        System.out.println("6)Jeera rice\t\t\t\t\t\t\t142");
        System.out.println("");
        System.out.println("7)Steemed rice\t\t\t\t\t\t\t120");
        System.out.println("");
        System.out.println("8)Biryani\t\t\t\t\t\t\t350");
        System.out.println(""); 
        System.out.println(""); 
        System.out.println("__________________________________________________________________________________________________________________________________________________"); 
    } //end of meathod print4

    public void print5()
    {//start of meathod print5
        System.out.println("\t V] ROTI\t\t\t\t\t\tPRICE");
        System.out.println("\t    ````\t\t\t\t\t\t`````"); 
        System.out.println("");
        System.out.println("1)Plain roti\t\t\t\t\t\t\t40"); 
        System.out.println(""); 
        System.out.println("2)Butter roti\t\t\t\t\t\t\t50"); 
        System.out.println(""); 
        System.out.println("3)Masala roti\t\t\t\t\t\t\t60");      
        System.out.println(""); 
        System.out.println("4)Naan\t\t\t\t\t\t\t\t50"); 
        System.out.println(""); 
        System.out.println("5)Masala naan\t\t\t\t\t\t\t85"); 
        System.out.println(""); 
        System.out.println("6)Paratha\t\t\t\t\t\t\t62");       
        System.out.println("");     
        System.out.println("7)Stuffed paratha\t\t\t\t\t\t50");
        System.out.println(""); 
        System.out.println(""); 
        System.out.println("__________________________________________________________________________________________________________________________________________________"); 
    }//end of meathod print5

    public void print6()
    {//start of meathod print6
        System.out.println("\t VI] BEVERAGES\t\t\t\t\t\tPRICE");
        System.out.println("\t     `````````\t\t\t\t\t\t`````");
        System.out.println(""); 
        System.out.println("1)Aerated water\t\t\t\t\t\t\t75"); 
        System.out.println(""); 
        System.out.println("2)Water\t\t\t\t\t\t\t\t75"); 
        System.out.println(""); 
        System.out.println("3)Zaffran special juice\t\t\t\t\t\t85"); 
        System.out.println(""); 
        System.out.println("4)Zaffran punch\t\t\t\t\t\t\t65"); 
        System.out.println(""); 
        System.out.println("5)Tea\t\t\t\t\t\t\t\t92"); 
        System.out.println(""); 
        System.out.println("6)Red bull\t\t\t\t\t\t\t40");
        System.out.println(""); 
        System.out.println("7)Jeera masala\t\t\t\t\t\t\t75"); 
        System.out.println(""); 
        System.out.println("8)Coffee\t\t\t\t\t\t\t75"); 
        System.out.println(""); 
        System.out.println(""); 
        System.out.println("__________________________________________________________________________________________________________________________________________________"); 
    }//end of meathod print6

    public void print7()
    {//start of meathod print7   
        System.out.println("\t VII] MOCKTAILS\t\t\t\t\t\tPRICE"); 
        System.out.println("\t      `````````\t\t\t\t\t\t`````"); 
        System.out.println(""); 
        System.out.println("1)Margarita's\t\t\t\t\t\t\t145"); 
        System.out.println("");        
        System.out.println("2)Mojito's\t\t\t\t\t\t\t145");
        System.out.println(""); 
        System.out.println("3)Hot toddy\t\t\t\t\t\t\t145"); 
        System.out.println(""); 
        System.out.println("4)Middleastern lemonade\t\t\t\t\t\t162"); 
        System.out.println(""); 
        System.out.println("5)sherffod\t\t\t\t\t\t\t120"); 
        System.out.println(""); 
        System.out.println("6)Coffe mud pie\t\t\t\t\t\t\t155"); 
        System.out.println(""); 
        System.out.println("");
        System.out.println("__________________________________________________________________________________________________________________________________________________"); 
    }//end of meathod print7

    public void print8()
    {//start of meathod print8
        System.out.println("\t VIII] DESERTS\t\t\t\t\t\tPRICE"); 
        System.out.println("\t       ```````\t\t\t\t\t\t`````"); 
        System.out.println(""); 
        System.out.println("1)Gulab jamun\t\t\t\t\t\t\t95"); 
        System.out.println(""); 
        System.out.println("2)Rasmalai\t\t\t\t\t\t\t100"); 
        System.out.println(""); 
        System.out.println("3)Rossogulla\t\t\t\t\t\t\t95"); 
        System.out.println(""); 
        System.out.println("4)Kulfi\t\t\t\t\t\t\t\t65"); 
        System.out.println(""); 
        System.out.println("5)Walnut brownie\t\t\t\t\t\t155"); 
        System.out.println(""); 
        System.out.println("6)Chocolate brownie\t\t\t\t\t\t145"); 
        System.out.println(""); 
        System.out.println("7)Caramel custard\t\t\t\t\t\t135");
        System.out.println(""); 
        System.out.println(""); 
        System.out.println("__________________________________________________________________________________________________________________________________________________"); 
    }//end of meathod print8

    public void order()throws IOException
    {   /**start of meathod order
        ind this meathod order is been taken from the user*/
        System.out.println("Way to select order...");
        System.out.println("``` `` `````` ````````"); 
        System.out.println("");
        System.out.println("");
        System.out.println("STEP 1:");
        System.out.println("first enter the number corresponding to the category of food");
        System.out.println("(eg: if you want to select I] SOUPS then enter 1)");
        System.out.println("(if you want to select VII] MOCKTAILS then enter 7)");
        System.out.println("");
        System.out.println("STEP 2:");
        System.out.println("then enter the second number corresponding to item");
        System.out.println("(eg:if you want to order chocolate brownie then first enter 8(category-desserts))");
        System.out.println("(and then enter number corresponding to item.(in this case enter 6))");
        double totalf=0.0;
        mainloop://naming of the loop
        for(int o=0;o>=0;o++)
        {
            System.out.println("enter first number(category of food soup,starter,rice as the like)");
            while(true)//loop to check weather the input entered by the user is a number or not
            {
                try
                {
                    cf=Integer.parseInt(br.readLine());
                }
                catch(NumberFormatException obj)
                {
                    System.out.println("enter a valid number");
                    continue;
                }
                break;
            }
            if(cf==1)
            {
                System.out.println("you have selected soup category!!");
                soup://naming of the loop
                for(int q=0;q>=0;q++)
                {
                    System.out.println("now please enter the soup you want to order(enter the number corresponding to item)");
                    System.out.println("if you don't want to order any soup enter 0");
                    System.out.println("");
                    while(true)
                    {
                        try
                        {
                            subcf1=Integer.parseInt(br.readLine());
                        }
                        catch(NumberFormatException obj)
                        {
                            System.out.println("enter a valid number");
                            continue;
                        }
                        break;
                    }
                    if(subcf1==1)
                    { 
                        System.out.println("you have ordered Safed tamatar aur tulsi ka shorba"); 
                        item[k]="safed tamatar aur tulsi ka shorba";
                        System.out.println("please enter number bowls of soup you want."); 
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number valid");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];

                        k++;
                    }
                    else if(subcf1==2)
                    {
                        System.out.println("you have ordered Tomato dhania shorba!!"); 
                        item[k]="Tomato dhania shorba\t\t";
                        System.out.println("please enter the number of bowls you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a  valid number");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==3)
                    { 
                        System.out.println("you have ordered Dum murg shorba"); 
                        item[k]="dum murg shorba\t\t\t";
                        System.out.println("please enter the number of bowls you want"); 
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==4)
                    { 
                        System.out.println("you have ordered Murg zaffrani shorba"); 
                        item[k]="murg zaffrani shorba\t\t";
                        System.out.println("please enter the quantity of bowls you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==0)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("enter the number only corresponding to the item!!");
                        System.out.println("there is no item corrresponding to number "+subcf1);
                        continue;
                    }
                    for(int i=0;i<k;i++)
                    {
                        totalf=price1[k]+price1[k+1];
                    }

                    while(true)
                    {
                        System.out.println("do you want to order any other Soup??");
                        System.out.println("enter 1 for yes and 2 for no");
                        while(true)
                        {
                            try
                            {
                                d=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        if(d==1)
                        {
                            continue soup;
                        }
                        else if(d==2)
                        {
                            break soup;
                        }
                        else
                        {
                            System.out.println("please enter 1 or 2 only");
                            System.out.println("there is no option in number "+d);
                            continue;
                        } 
                    }
                }
                while(true)
                {
                    System.out.println("Do you want to order anything else?");
                    System.out.println("enter 1 for yes and 2 for no");
                    while(true)
                    {
                        try
                        {
                            abc=Integer.parseInt(br.readLine());
                        } 
                        catch(NumberFormatException obj)
                        {
                            System.out.println("enter a valid number");
                            continue;
                        }
                        break;
                    }
                    if(abc==1)
                    {
                        continue mainloop;
                    }
                    else if(abc==2)
                    {
                        break mainloop;
                    }
                    else
                    {
                        System.out.println("please enter 1 or 2 only");
                        continue;
                    }
                }
            }

            else if(cf==2)
            {
                System.out.println("you have selected Starter(veg) category!!");
                Starterveg:
                for(int q=0;q>=0;q++)
                {
                    System.out.println("now please enter the Starter you want to order(enter the number corresponding to item)");
                    System.out.println("if you don't want to order any Starter(veg) enter 0");
                    while(true)
                    {
                        try
                        {
                            subcf1=Integer.parseInt(br.readLine());
                        } 
                        catch(NumberFormatException obj)
                        {
                            System.out.println("enter a valid number");
                            continue;
                        }
                        break;
                    }
                    if(subcf1==1)
                    {   
                        System.out.println("you have ordered Achari paneer tikka\t\t"); 
                        item[k]="Achari paneer tikka\t\t";
                        System.out.println("please enter number of plates you want"); 
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==2)
                    {
                        System.out.println("you have ordered Paneer tikka"); 
                        item[k]="Paneer tikka\t\t\t";
                        System.out.println("please enter the number of plates you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==3)
                    { 
                        System.out.println("you have ordered Pudhina paneer tikka"); 
                        item[k]="pudhina paneer tikka\t\t";
                        System.out.println("please enter the number of plates you want"); 
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==4)
                    {
                        System.out.println("you have ordered Tandoori mushroom cheese melt"); 
                        item[k]="tandoori mushroom cheese melt\t";
                        System.out.println("please enter the quantity of plates you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==5)
                    { 
                        System.out.println("you have ordered Tandoori broccoli"); 
                        item[k]="tandoori broccoli\t\t";
                        System.out.println("please enter the quantity of plates you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==6)
                    { 
                        System.out.println("you have ordered Vegetable galouti kabab"); 
                        item[k]="vegetable galouti kabab\t\t";
                        System.out.println("please enter the quantity of plates you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==7)
                    { 
                        System.out.println("you have ordered Chilli cheese pakoras"); 
                        item[k]="chilli cheese pakoras\t\t";
                        System.out.println("please enter the quantity of plates you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==8)
                    { 
                        System.out.println("you have ordered Zaffran signature nanlets"); 
                        item[k]="zaffran signature nanlets\t";
                        System.out.println("please enter the quantity of plates you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==0)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("please enter number only corresponding to item");
                        System.out.println("there is no item corrresponding to number "+subcf1);
                        continue;
                    }
                    while(true)
                    {
                        System.out.println("do you want to order any other Starter(veg)??");
                        System.out.println("enter 1 for yes and 2 for no");
                        while(true)
                        {
                            try
                            {
                                d=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        if(d==1)
                        {
                            continue Starterveg;
                        }
                        else if(d==2)
                        {
                            break Starterveg;
                        }
                        else
                        {
                            System.out.println("please enter 1 or 2 only");
                            System.out.println("there is no option in number "+d);
                            continue;
                        } 
                    }
                }
                while(true)
                {
                    System.out.println("Do you want to order anything else?");
                    System.out.println("enter 1 for yes and 2 for no");
                    while(true)
                    {
                        try
                        {
                            abc=Integer.parseInt(br.readLine());
                        } 
                        catch(NumberFormatException obj)
                        {
                            System.out.println("enter a valid number");
                            continue;
                        }
                        break;
                    }
                    if(abc==1)
                    {
                        continue mainloop;
                    }
                    else if(abc==2)
                    {
                        break mainloop;
                    }
                    else
                    {
                        System.out.println("please enter 1 or 2 only");
                        System.out.println("there is no option in number "+abc);
                        continue; 
                    }
                }
            }
            else if(cf==3)
            { 
                System.out.println("you have selected Starter(non-veg) category!!");
                startern:
                for(int q=0;q>=0;q++)
                {
                    System.out.println("now please enter the Starter you want to order(enter the number corresponding to item)");
                    System.out.println("if you don't want to order any starter(non-veg) enter 0");
                    while(true)
                    {
                        try
                        {
                            subcf1=Integer.parseInt(br.readLine());
                        } 
                        catch(NumberFormatException obj)
                        {
                            System.out.println("enter a number only");
                            continue;
                        }
                        break;
                    }
                    if(subcf1==1)
                    {  
                        System.out.println("you have ordered Tandoori murg"); 
                        item[k]="Tanduri murg\t\t\t";
                        System.out.println("please enter number of plates you want."); 
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==2)
                    {
                        System.out.println("you have ordered Murg chello kabab"); 
                        item[k]="murg chello kabab\t\t";
                        System.out.println("please enter the number of plates you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number number");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==3)
                    { 
                        System.out.println("you have ordered Murg kalmi kabab"); 
                        item[k]="Murg kalmi kabab\t\t";
                        System.out.println("please enter the number of plates you want"); 
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number only");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==4)
                    { 
                        System.out.println("you have ordered Murg tikka"); 
                        item[k]="Murg tikka\t\t\t";
                        System.out.println("please enter the quantity of plates you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==5)
                    { 
                        System.out.println("you have ordered Murg hariyali tikka"); 
                        item[k]="murg hariyali tikka\t\t";
                        System.out.println("please enter the quantity of plates you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==6)
                    { 
                        System.out.println("you have ordered Murg kalimirch tikka"); 
                        item[k]="Murg kalimirch tikka\t\t";
                        System.out.println("please enter the quantity of plates you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==7)
                    { 
                        System.out.println("you have ordered Tandoori promfret"); 
                        item[k]="Tandoori promfret\t\t";
                        System.out.println("please enter the quantity of plates you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number ");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==8)
                    { 
                        System.out.println("you have ordered Tandoori prawns"); 
                        item[k]="Tanrooni prawns\t\t\t";
                        System.out.println("please enter the quantity of plates you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==0)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("please enter the number only corresponding to item");
                        System.out.println("there is no item corrresponding to number "+subcf1);
                        continue;
                    }

                    while(true)
                    {
                        System.out.println("do you want to order any other starters(non-veg)??");
                        System.out.println("enter 1 for yes and 2 for no");
                        while(true)
                        {
                            try
                            {
                                d=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        if(d==1)
                        {
                            continue startern;
                        }
                        else if(d==2)
                        {
                            break startern;
                        }
                        else
                        {
                            System.out.println("please enter 1 or 2 only");
                            System.out.println("there is no option in number "+d);
                            continue;
                        }
                    }
                }
                while(true)
                {
                    System.out.println("Do you want to order anything else?");
                    System.out.println("enter 1 for yes and 2 for no");
                    while(true)
                    {
                        try
                        {
                            abc=Integer.parseInt(br.readLine());
                        } 
                        catch(NumberFormatException obj)
                        {
                            System.out.println("enter a valid number");
                            continue;
                        }
                        break;
                    }
                    if(abc==1)
                    {
                        continue mainloop;
                    }
                    else if(abc==2)
                    {
                        break mainloop;
                    }
                    else
                    {
                        System.out.println("please enter 1 or 2 only");
                        System.out.println("there is no option in number "+abc);
                        continue; 
                    }
                }
            }
            else if(cf==4)
            { 
                System.out.println("you have selected Rice category!!");
                rice:
                for(int q=0;q>=0;q++)
                {
                    System.out.println("now please enter the type of rice you want to order(enter the number corresponding to item)");
                    System.out.println("if you don't want any rice enter 0");
                    subcf1=Integer.parseInt(br.readLine());
                    if(subcf1==1)
                    { 
                        System.out.println("you have ordered Sules biryani"); 
                        item[k]="Sules biryani\t\t\t";
                        System.out.println("please enter number of plates you want."); 
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==2)
                    {
                        System.out.println("you have ordered Dal khichdi"); 
                        item[k]="Dal khichdi\t\t\t";
                        System.out.println("please enter the number of plates you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==3)
                    { 
                        System.out.println("you have ordered Broccoli dal khichdi"); 
                        item[k]="Broccoli dal khichdi\t\t";
                        System.out.println("please enter the number of plates you want"); 
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==4)
                    {
                        System.out.println("you have ordered Murg biryani"); 
                        item[k]="Murg biryani\t\t\t";
                        System.out.println("please enter the quantity of plates you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==5)
                    { 
                        System.out.println("you have ordered Murg tikka biryani"); 
                        item[k]="Murg tikka biryani\t\t";
                        System.out.println("please enter the quantity of plates you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==6)
                    { 
                        System.out.println("you have ordered Jeera rice"); 
                        item[k]="Jeera rice\t\t\t";
                        System.out.println("please enter the quantity of plates you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==7)
                    { 
                        System.out.println("you have ordered Steemed rice"); 
                        item[k]="Steemed rice\t\t\t";
                        System.out.println("please enter the quantity of plates you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;

                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==8)
                    { 
                        System.out.println("you have ordered Biryani"); 
                        item[k]="Biryani\t\t\t\t";
                        System.out.println("please enter the quantity of plates you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==0)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("please enter the number only corresonding to item");
                        System.out.println("there is no item corrresponding to number "+subcf1);
                        continue;
                    }

                    while(true)
                    {
                        System.out.println("do you want to order any other Rice??");
                        System.out.println("enter 1 for yes and 2 for no");
                        while(true)
                        {
                            try
                            {
                                d=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        if(d==1)
                        {
                            continue rice;
                        }
                        else if(d==2)
                        {
                            break rice;
                        }
                        else
                        {
                            System.out.println("please enter 1 or 2 only");
                            System.out.println("there is no option in number "+d);
                            continue; 
                        }
                    }
                }
                while(true)
                {
                    System.out.println("Do you want to order anything else?");
                    System.out.println("enter 1 for yes and 2 for no");
                    while(true)
                    {
                        try
                        {
                            abc=Integer.parseInt(br.readLine());
                        } 
                        catch(NumberFormatException obj)
                        {
                            System.out.println("enter a valid number");
                            continue;
                        }
                        break;
                    }
                    if(abc==1)
                    {
                        continue mainloop;
                    }
                    else if(abc==2)
                    {
                        break mainloop;
                    }
                    else
                    {
                        System.out.println("please enter 1 or 2 only");
                        System.out.println("there is no option in number "+abc);
                        continue; 
                    }
                }
            }

            else if(cf==5)
            { 
                System.out.println("you have selected Roti category!!");
                roti:
                for(int q=0;q>=0;q++)
                {
                    System.out.println("now please enter the type of roti you want to order(enter the number corresponding to item)");
                    System.out.println("if you don't want any roti enter 0");
                    while(true)
                    {
                        try
                        {
                            subcf1=Integer.parseInt(br.readLine());
                        } 
                        catch(NumberFormatException obj)
                        {
                            System.out.println("enter a valid number");
                            continue;
                        }
                        break;
                    }
                    if(subcf1==1)
                    {  
                        System.out.println("you have ordered Plain roti"); 
                        item[k]="Plain roti\t\t\t";
                        System.out.println("please enter number of Roti you want."); 
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==2)
                    {
                        System.out.println("you have ordered Butter roti"); 
                        item[k]="Butter roti\t\t\t";
                        System.out.println("please enter the number of Roti you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==3)
                    { 
                        System.out.println("you have ordered Masala roti"); 
                        item[k]="Masala roti\t\t\t";
                        System.out.println("please enter the number of Roti you want"); 
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==4)
                    { 
                        System.out.println("you have ordered Naan"); 
                        item[k]="Naan\t\t\t\t";
                        System.out.println("please enter the quantity of naan's you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==5)
                    { 
                        System.out.println("you have ordered Butter naan"); 
                        item[k]="Butter naan\t\t\t";
                        System.out.println("please enter the quantity of butter naan you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==6)
                    { 
                        System.out.println("you have ordered Masala naan"); 
                        item[k]="Masala naan\t\t\t";
                        System.out.println("please enter the quantity of masala naan you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a valid number");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==7)
                    { 
                        System.out.println("you have ordered Paratha"); 
                        item[k]="Paratha\t\t\t\t";
                        System.out.println("please enter the quantity of paratha's you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==8)
                    { 
                        System.out.println("you have ordered Stuffed paratha"); 
                        item[k]="Stuffed paratha\t\t\t";
                        System.out.println("please enter the quantity of stuffed paratha's you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==0)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("please enter the number only corresponding to item");
                        System.out.println("there is no item corrresponding to number "+subcf1);
                        continue;
                    }

                    while(true)
                    {
                        System.out.println("do you want to order any other type of roti??");
                        System.out.println("enter 1 for yes and 2 for no");
                        while(true)
                        {
                            try
                            {
                                d=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        if(d==1)
                        {
                            continue roti;
                        }
                        else if(d==2)
                        {
                            break roti;
                        }
                        else
                        {
                            System.out.println("please enter 1 or 2 only");
                            System.out.println("there is no option in number "+d);
                            continue;  
                        }
                    }
                }
                while(true)
                {
                    System.out.println("Do you want to order anything else?");
                    System.out.println("enter 1 for yes and 2 for no");
                    while(true)
                    {
                        try
                        {
                            abc=Integer.parseInt(br.readLine());
                        } 
                        catch(NumberFormatException obj)
                        {
                            System.out.println("enter a number only");
                            continue;
                        }
                        break;
                    }
                    if(abc==1)
                    {
                        continue mainloop;
                    }
                    else if(abc==2)
                    {
                        break mainloop;
                    }
                    else
                    {
                        System.out.println("please enter 1 or 2 only");
                        System.out.println("there is no option in number "+abc);
                        continue; 
                    }
                }
            }
            else if(cf==6)
            { 
                System.out.println("you have selected Bevrages category!!");
                beverages:
                for(int q=0;q>=0;q++)
                {
                    System.out.println("now please enter the type of roti you want to order(enter the number corresponding to item)");
                    System.out.println("if you don't want any Bevrages enter 0");
                    while(true)
                    {
                        try
                        {
                            subcf1=Integer.parseInt(br.readLine());
                        } 
                        catch(NumberFormatException obj)
                        {
                            System.out.println("enter a number only");
                            continue;
                        }
                        break;
                    }
                    if(subcf1==1)
                    {
                        System.out.println("you have ordered Aerated water"); 
                        item[k]=" Aerated water\t\t\t";
                        System.out.println("please enter number of glass you want."); 
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==2)
                    {
                        System.out.println("you have ordered Water"); 
                        item[k]="Water\t\t\t\t";
                        System.out.println("please enter the number of glass you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==3)
                    { 
                        System.out.println("you have ordered Zaffran special juice"); 
                        item[k]=" Zaffran special juice\t\t";
                        System.out.println("please enter the number of glass you want"); 
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==4)
                    { 
                        System.out.println("you have ordered Zaffran punch"); 
                        item[k]="Zaffran punch\t\t\t";
                        System.out.println("please enter the quantity of glass you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==5)
                    { 
                        System.out.println("you have ordered Tea"); 
                        item[k]="Tea\t\t\t\t";
                        System.out.println("please enter the quantity of glass you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==6)
                    { 
                        System.out.println("you have ordered Red bull"); 
                        item[k]="Red bull\t\t\t";
                        System.out.println("please enter the quantity of cans you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==7)
                    { 
                        System.out.println("you have ordered Jeera masala"); 
                        item[k]="Jeera masala\t\t\t";
                        System.out.println("please enter the quantity of glass you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==8)
                    { 
                        System.out.println("you have ordered Coffee"); 
                        item[k]="Coffee\t\t\t\t";
                        System.out.println("please enter the quantity of glass you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==0)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("please enter the number only corresponding to item");
                        System.out.println("there is no item corrresponding to number "+subcf1);
                        continue;
                    }

                    while(true)
                    {
                        System.out.println("do you want to order any other Beverages??");
                        System.out.println("enter 1 for yes and 2 for no");
                        while(true)
                        {
                            try
                            {
                                d=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        if(d==1)
                        {
                            continue beverages;
                        }
                        else if(d==2)
                        {
                            break beverages;
                        }
                        else
                        {
                            System.out.println("please enter 1 or 2 only");
                            System.out.println("there is no option in number "+abc);
                            continue; 
                        }
                    }
                }
                while(true)
                {
                    System.out.println("Do you want to order anything else?");
                    System.out.println("enter 1 for yes and 2 for no");
                    while(true)
                    {
                        try
                        {
                            abc=Integer.parseInt(br.readLine());
                        } 
                        catch(NumberFormatException obj)
                        {
                            System.out.println("enter a number only");
                            continue;
                        }
                        break;
                    }
                    if(abc==1)
                    {
                        continue mainloop;
                    }
                    else if(abc==2)
                    {
                        break mainloop;
                    }
                    else
                    {
                        System.out.println("please enter 1 or 2 only");
                        System.out.println("there is no option in"+abc);
                        continue;
                    }
                }
            }
            else if(cf==7)
            { 
                System.out.println("you have selected Mocktails category!!");
                mocktails:
                for(int q=0;q>=0;q++)
                {
                    System.out.println("now please enter the type of Mocktail you want to order(enter the number corresponding to item)");
                    System.out.println("if you don't want any Mocktail enter 0");
                    while(true)
                    {
                        try
                        {
                            subcf1=Integer.parseInt(br.readLine());
                        } 
                        catch(NumberFormatException obj)
                        {
                            System.out.println("enter a number only");
                            continue;
                        }
                        break;
                    }
                    if(subcf1==1)
                    {  
                        System.out.println("you have ordered Margarita's"); 
                        item[k]="Margarita's\t\t\t";
                        System.out.println("please enter number of glass you want."); 
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==2)
                    {
                        System.out.println("you have ordered Mojito's"); 
                        item[k]="Mojito's\t\t\t";
                        System.out.println("please enter the number of glass you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==3)
                    { 
                        System.out.println("you have ordered Hot toddy"); 
                        item[k]="Hot toddy\t\t\t";
                        System.out.println("please enter the number of glass you want"); 
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==4)
                    { 
                        System.out.println("you have ordered Middleastern"); 
                        item[k]="Middleastern lemonade\t\t";
                        System.out.println("please enter the quantity of glass you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==5)
                    { 
                        System.out.println("you have ordered Sherffod"); 
                        item[k]="Sherffod\t\t\t";
                        System.out.println("please enter the quantity of glass you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==6)
                    { 
                        System.out.println("you have ordered Coffee mud pie"); 
                        item[k]="Coffee mud pie\t\t\t";
                        System.out.println("please enter the quantity of cans you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==0)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("please enter the number only corresponding to item");
                        System.out.println("there is no item corrresponding to number "+subcf1);
                        continue;
                    }

                    while(true)
                    {
                        System.out.println("do you want to order any other Mocktails??");
                        System.out.println("enter 1 for yes and 2 for no");
                        while(true)
                        {
                            try
                            {
                                d=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        if(d==1)
                        {
                            continue mocktails;
                        }
                        else if(d==2)
                        {
                            break mocktails;
                        }
                        else
                        {
                            System.out.println("please enter 1 or 2 only");
                            System.out.println("there is no option in number "+d);
                            continue;  
                        }
                    }
                }
                while(true)
                {
                    System.out.println("Do you want to order anything else?");
                    System.out.println("enter 1 for yes and 2 for no");
                    while(true)
                    {
                        try
                        {
                            abc=Integer.parseInt(br.readLine());
                        } 
                        catch(NumberFormatException obj)
                        {
                            System.out.println("enter a number only");
                            continue;
                        }
                        break;
                    }
                    if(abc==1)
                    {
                        continue mainloop;
                    }
                    else if(abc==2)
                    {
                        break mainloop;
                    }
                    else
                    {
                        System.out.println("please enter 1 or 2 only");
                        System.out.println("there is no option in number "+abc);
                        continue;  
                    }
                }
            }

            else if(cf==8)
            { 
                System.out.println("you have selected Desserts category!!");
                desserts:
                for(int q=0;q>=0;q++)
                {
                    System.out.println("now please enter the type of Dessert you want to order(enter the number corresponding to item)");
                    System.out.println("if you don't want any Dessert enter 0");
                    while(true)
                    {
                        try
                        {
                            subcf1=Integer.parseInt(br.readLine());
                        } 
                        catch(NumberFormatException obj)
                        {
                            System.out.println("enter a number only");
                            continue;
                        }
                        break;
                    }
                    if(subcf1==1)
                    {  
                        System.out.println("you have ordered Gulab jamun"); 
                        item[k]="Gulab jamun\t\t\t";
                        System.out.println("please enter number of gulab jamun you want."); 
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==2)
                    {
                        System.out.println("you have ordered Rasmalai"); 
                        item[k]="Rasmalai\t\t\t";
                        System.out.println("please enter the number of plates you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==3)
                    { 
                        System.out.println("you have ordered Rassogulla"); 
                        item[k]="Rossogulla\t\t\t";
                        System.out.println("please enter the number of Rissogulla you want"); 
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==4)
                    { 
                        System.out.println("you have ordered Kulfi"); 
                        item[k]="Kulfi\t\t\t\t";
                        System.out.println("please enter the quantity of Kulfi you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==5)
                    { 
                        System.out.println("you have ordered Walnut brownie"); 
                        item[k]="Walnut brownie\t\t\t";
                        System.out.println("please enter the quantity of plates you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==6)
                    { 
                        System.out.println("you have ordered Chocolate brownie"); 
                        item[k]="Chocolate Brownie\t\t";
                        System.out.println("please enter the quantity of plates you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==7)
                    { 
                        System.out.println("you have ordered Caramed custard"); 
                        item[k]="Caramel custard\t\t\t";
                        System.out.println("please enter the quantity of plates you want");
                        while(true)
                        {
                            try
                            {
                                quantity=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        qty[k]=quantity;
                        price1[k]=150*qty[k];
                        tax1[k]=0.5/100*price1[k];
                        price1[k]=price1[k]+tax1[k];
                        k++;
                    }
                    else if(subcf1==0)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("please enter the number only corresonding to item");
                        System.out.println("there is no item corrresponding to number "+subcf1);
                        continue;
                    }

                    while(true)
                    {
                        System.out.println("do you want to order any other Desserts??");
                        System.out.println("enter 1 for yes and 2 for no");
                        while(true)
                        {
                            try
                            {
                                d=Integer.parseInt(br.readLine());
                            } 
                            catch(NumberFormatException obj)
                            {
                                System.out.println("enter a number only");
                                continue;
                            }
                            break;
                        }
                        if(d==1)
                        {
                            continue desserts;
                        }
                        else if(d==2)
                        {
                            break desserts;
                        }
                        else
                        {
                            System.out.println("please enter 1 or 2 only");
                            System.out.println("there is no option in number "+d);
                            continue;  
                        }
                    }
                }
                while(true)
                {
                    System.out.println("Do you want to order anything else?");
                    System.out.println("enter 1 for yes and 2 for no");
                    while(true)
                    {
                        try
                        {
                            abc=Integer.parseInt(br.readLine());
                        } 
                        catch(NumberFormatException obj)
                        {
                            System.out.println("enter a number only");
                            continue;
                        }
                        break;
                    }
                    if(abc==1)
                    {
                        continue mainloop;
                    }
                    else if(abc==2)
                    {
                        break mainloop;
                    }
                    else
                    {
                        System.out.println("please enter 1 or 2 only");
                        System.out.println("there is no option in number "+abc);
                        continue;  
                    }
                }
            }
            else
            {  
                System.out.println("please enter the number corresponding to category only");
                System.out.println("there is no item corrresponding to number "+cf);
                continue;
            }
        }
    }

    public void bill()
    {//start of meathod bill
        System.out.println('\u000C');//statement to clear screen
        int a=0;
        for(int x=0;x<1000;x++)
        { //loop for loading
            System.out.println("your bill is generating");
            System.out.println("please wait...");
            System.out.println("Loading"+a+"%");
            a++;//incrementing the value of a to proceed loading
            for(double i=0;i<700000;i+=0.1)//a loop to delay time
            { 

            }
            if(a==101)
            {
                break;
            }
            System.out.println('\u000C');//statement to clear screen
        }
        System.out.print("\t\t\t\t\t\tZ");
        for(double i=0;i<7000000;i+=0.1)//a loop to delay time
        { 

        }
        System.out.print("A");
        for(double i=0;i<7000000;i+=0.1)//a loop to delay time
        { 

        }
        System.out.print("F");
        for(double i=0;i<7000000;i+=0.1)//a loop to delay time
        { 

        }
        System.out.print("F");
        for(double i=0;i<7000000;i+=0.1)//a loop to delay time
        { 

        }
        System.out.print("R");
        for(double i=0;i<7000000;i+=0.1)//a loop to delay time
        { 

        }
        System.out.print("A");
        for(double i=0;i<7000000;i+=0.1)//a loop to delay time
        { 

        }
        System.out.print("N");
        for(double i=0;i<7000000;i+=0.1)//a loop to delay time
        { 

        }
        System.out.print(" ");
        for(double i=0;i<7000000;i+=0.1)//a loop to delay time
        { 

        }
        System.out.print("B");
        for(double i=0;i<7000000;i+=0.1)//a loop to delay time
        { 

        }
        System.out.print("I");
        for(double i=0;i<7000000;i+=0.1)//a loop to delay time
        { 

        }
        System.out.print("L");
        for(double i=0;i<7000000;i+=0.1)//a loop to delay time
        { 

        }
        System.out.println("L");
        System.out.println("\t\t\t\t\t\t``````` ````");
        System.out.println("");
        System.out.println("ITEM\t\t\t\t\t\t\t\tQTY\t\t\t\t\t\tPRICE");
        System.out.println("````\t\t\t\t\t\t\t\t```\t\t\t\t\t\t`````");
        for(int j=0;j<k;j++)
        {
            System.out.println(item[j]+"\t\t\t\t"+qty[j]+"\t\t\t\t\t\t"+price1[j]);
        }
    }//end of meathod bill

    public void design()
    {//a meathod for thanking the user
        for(int z=0;z<=8;z++)
        {
            System.out.println("THANK YOU!!");
            System.out.println("````` `````");
            System.out.println("VISIT AGAIN");
            System.out.println("````` `````");
            System.out.println("");
            System.out.println("");
            System.out.println("                     ______________");
            System.out.println("                    |              |");
            System.out.println("                    |    0    0    |"); 
            System.out.println("                    |      -       |");
            System.out.println("                    |    (----)    |");
            System.out.println("                    |              |");
            System.out.println("                    ---------------");
            System.out.println("                          | |");
            System.out.println("                          | |");
            System.out.println("                   /---------------- --------------0");
            System.out.println("                  /       | |       ");
            System.out.println("                 /        | |");
            System.out.println("                /         | |");
            System.out.println("               /          | |");
            System.out.println("              0           | |");
            System.out.println("                          # #");
            System.out.println("                         #    #");
            System.out.println("                        #      #");
            System.out.println("                       #        #");
            System.out.println("                      #          #");
            System.out.println("                  ~~~~            ~~~~");
            System.out.println("");
            System.out.println("");
            System.out.println("======================================================================================================================");
            for(double i=0;i<9000000;i+=1)//delay loop
            {}
            for(double i=0;i<9000000;i+=1)//delay loop
            {}
            System.out.println('\u000C');
            System.out.println("THANK YOU!!");
            System.out.println("````` `````");
            System.out.println("VISIT AGAIN");
            System.out.println("````` `````");
            System.out.println("");
            System.out.println("");
            System.out.println("                     ______________");
            System.out.println("                    |              |");
            System.out.println("                    |    0    0    |"); 
            System.out.println("                    |      -       |");
            System.out.println("                    |    (----)    |      0");
            System.out.println("                    |              |     /");
            System.out.println("                    ---------------     /");
            System.out.println("                          | |          /");
            System.out.println("                          | |         /");
            System.out.println("                   /---------------- /");
            System.out.println("                  /       | |       ");
            System.out.println("                 /        | |");
            System.out.println("                /         | |");
            System.out.println("               /          | |");
            System.out.println("              0           | |");
            System.out.println("                          # #");
            System.out.println("                         #    #");
            System.out.println("                        #      #");
            System.out.println("                       #        #");
            System.out.println("                      #          #");
            System.out.println("                  ~~~~            ~~~~");
            System.out.println("");
            System.out.println("");
            System.out.println("======================================================================================================================");
            for(double i=0;i<9000000;i+=1)
            {}
            for(double i=0;i<9000000;i+=1)//delay loop
            {}
            System.out.println('\u000C');//statement to clear screen
        }
        System.out.println("");
    }//end of meathod design

    public void main()throws IOException
    {  /*# main meathod where all the functions are called*/
        ZAFFRAN obj=new ZAFFRAN();
        obj.print1();
        obj.print2();
        obj.print3();
        obj.print4();
        obj.print5();
        obj.print6();
        obj.print7();
        obj.print8();
        obj.order();
        obj.bill();
        System.out.println("Do you want to place another order");
        System.out.println("enter 1 for yes");
        System.out.println("enter 2 for no");
        while(true)
        {
            while(true)//a loop to check if ld is a number or not
            {
                try
                {
                    lastd=Integer.parseInt(br.readLine());
                } 
                catch(NumberFormatException e)
                {
                    System.out.println("enter a valid number only");
                    //if its not a number this message will be printed 
                    continue;
                }
                break;
            }
            if(lastd==1)
            {
                System.out.println('\u000C');//statement to clear screen
                obj.main();//restarting the program
            }
            else if(lastd==2)
            { 
                obj.design();
            }
            else
            {
                System.out.println("please enter 1 or 2 only");
                System.out.println("there is no option in number "+lastd);
                continue;  
            }
            break;
        }/*#end of while loop */
    }/*# end of main meathod */
}/*#end of class*/