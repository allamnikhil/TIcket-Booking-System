package project;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class bus 
{
    Scanner d=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println();
		System.out.println("---------------------WEL COME  TO  ALLAM TRAVEL'S--------------------------");
		System.out.println("----------------------------safe and secure----------------------------");
	    Scanner d=new Scanner(System.in);
	    System.out.println("enter user name");
	    String username=d.nextLine();
	    System.out.println("Enter your Four digit password");
	    int pa=d.nextInt();
	    {
	    	if(pa==3264)
	    	{
	    System.out.println("Enter your mobile number");
	    Long ph=d.nextLong();
	    int adultprice=50,childprice=25;
	    int kpp=2;
	    String place="";
	    String local="";
	    System.out.println("welcome  "+username +" have a Safe and secure journey with us ");
	    System.out.println("enter your boarding location from below cities : \n1.hyderbad\n2.bengalore\n3.chennai\n4.mumbai\n5.delhi");
	    int bdcity=d.nextInt();	
	    if(bdcity==1)
	    {
	    	System.out.println("You have choosen Hyderabad ");
	    	System.out.println("Choose your boarding place :\n1.Uppal \n2.L.B Nagar \n3.Ameerpet \n4.KPHB");
	    	int cp=d.nextInt();
	    	String city="Hyderabad";
	    	place+="Hyderabad";
	    	if(cp==1)
	    	{
	    		System.out.println("You have choosen Uppal ");
	    	}if(cp==2){
	            System.out.println("Thank you for choosing L.B Nagar");
	        }if(cp==3){
	            System.out.println("Thank you for choosing Ameerpet");
	        }if(cp==4){
	            System.out.println("Thank you for choosing KPHB");
	        }
	        System.out.println("Choose your destination location : \n1.bengalore\n2.chennai\n3.mumbai\n4.delhi");
	        int des=d.nextInt();
	        switch(des)
	        {
	        case 1:
	        {
	        	System.out.println("You have choosen Bengalore as your Destination place :");
	        	System.out.println("choose your location point to drop :\n1.Marthalli\n2.hebbal\n3.Silkboard\n4.Electronic City");
	        	int hydtobng=605;
	            hydtobng*=kpp;
	             adultprice+=hydtobng;
	             childprice+=hydtobng;
	             local+="Bengalore";
	        	int dp=d.nextInt();
	        	String destination="Bengalore";
	        	if(dp==1)
	        	{
	        		System.out.println("your drop location Marthalli");
	        	}if(dp==2)
	        	{
	        		System.out.println("your drop location hebbal");
	        	}if(dp==3)
	        	{
	        		System.out.println("your drop location Silkboard");
	        	}if(dp==4)
	        	{
	        		System.out.println("your drop location Electronic City");
	        	}System.out.println("\n");
	        	System.out.println("your booking from "+city+" to "+destination+"\n");
	        }break;
	        case 2:
	        {
	        	System.out.println("You have choosen Chennai as your Destination place :");
	        	System.out.println("choose your location point to drop :\n1.Central\n2.Marina Beach\n3.VR Chennai\n4.Fort Museum");
	        	int hydtoche=500;
	            hydtoche*=kpp;
	             adultprice+=hydtoche;
	             childprice+=hydtoche;
	             local+="Chennai";
	        	int dp=d.nextInt();
	        	String destination="Chennai";
	        	if(dp==1)
	        	{
	        		System.out.println("your drop location Central");
	        	}if(dp==2)
	        	{
	        		System.out.println("your drop Marina Beach");
	        	}if(dp==3)
	        	{
	        		System.out.println("your drop VR Chennai");
	        	}if(dp==4)
	        	{
	        		System.out.println("your drop location Fort Museum");
	        	}System.out.println("\n");
	        	System.out.println("your booking from "+city+" to "+destination+"\n");
	        }break;
	        case 3:
	        {
	        	System.out.println("You have choosen Mumbai as your Destination place :");
	        	System.out.println("choose your location point to drop :\n1.Railway Station\n2.Beach\n3.old mumbai\n4.stadium");
	        	int hydtomum=460;
	        	hydtomum*=kpp;
	             adultprice+=hydtomum;
	             childprice+=hydtomum;
	             local+="Mumbai";
	        	int dp=d.nextInt();
	        	String destination="Mumbai";
	        	if(dp==1)
	        	{
	        		System.out.println("your drop location Railway Station");
	        	}if(dp==2)
	        	{
	        		System.out.println("your drop location Beach");
	        	}if(dp==3)
	        	{
	        		System.out.println("your drop location old mumbai");
	        	}if(dp==4)
	        	{
	        		System.out.println("your drop location stadium");
	        	}System.out.println("\n");
	        	System.out.println("your booking from "+city+" to "+destination+"\n");
	        }break;
	        case 4:
	        {
	        	System.out.println("You have choosen Delhi as your Destination place :");
	        	System.out.println("choose your location point to drop :\n1.India Gate\n2.Raj Ghat\n3.Minister Road\n4.President House");
	        	int hydtodel=605;
	        	hydtodel*=kpp;
	             adultprice+=hydtodel;
	             childprice+=hydtodel;
	             local+="Delhi";
	        	int dp=d.nextInt();
	        	String destination="Delhi";
	        	if(dp==1)
	        	{
	        		System.out.println("your drop location India Gate");
	        	}if(dp==2)
	        	{
	        		System.out.println("your drop location Raj Ghat");
	        	}if(dp==3)
	        	{
	        		System.out.println("your drop location Minister Road");
	        	}if(dp==4)
	        	{
	        		System.out.println("your drop location President House");
	        	}
	        	System.out.println("\n");
	        	System.out.println("your booking from "+city+" to "+destination+"\n");
	        }break;
	       }
	    }
	    if(bdcity==2)
	    {
	    	System.out.println("You have choosen Bengalore as your BOarding place :");
	    	System.out.println("choose your location point to Pickup :\n1.Marthalli\n2.hebbal\n3.Silkboard\n4.Electronic City");
	    	int bg=d.nextInt();
	    	String city="Bengalore";
	    	local+="Bengalore";
	    	if(bg==1)
	    	{
	    		System.out.println("your Pickup location Marthalli");
	    	}if(bg==2)
	    	{
	    		System.out.println("your Pickup location hebbal");
	    	}if(bg==3)
	    	{
	    		System.out.println("your Pickup location Silkboard");
	    	}if(bg==4)
	    	{
	    		System.out.println("your Pickup location Electronic City");
	    	}
	    	System.out.println("Choose your destination location : \n1.Hyderabad\n2.chennai\n3.mumbai\n4.delhi");
	        int des=d.nextInt();
	        switch(des)
	        {
	        case 1:
	        {
	        	System.out.println("You have choosen Hyderabad as your Destination place :");
	        	System.out.println("choose your location point to drop :\n1.Uppal\n2.L.B Nagar\n3.Ameerpet\n4.KPHB");
	        	int bngtohyd=605;
	        	bngtohyd*=kpp;
	             adultprice+=bngtohyd;
	             childprice+=bngtohyd;
	             local+="Hyderabad";
	        	int dp1=d.nextInt();
	        	String destination="Hyderabad";
	        	if(dp1==1)
	        	{
	        		System.out.println("your drop location Uppal");
	        	}if(dp1==2)
	        	{
	        		System.out.println("your drop location L.B Nagar");
	        	}if(dp1==3)
	        	{
	        		System.out.println("your drop location Ameerpet");
	        	}if(dp1==4)
	        	{
	        		System.out.println("your drop location KPHB");
	        	}System.out.println("\n");
	        	System.out.println("your booking from "+city+" to "+destination+"\n");
	        }break;
	        case 2:
	        {
	        	System.out.println("You have choosen Chennai as your Destination place :");
	        	System.out.println("choose your location point to drop :\n1.Central\n2.Marina Beach\n3.VR Chennai\n4.Fort Museum");
	        	int bngtoche=300;
	        	bngtoche*=kpp;
	             adultprice+=bngtoche;
	             childprice+=bngtoche;
	             local+="Chennai";
	        	int dp2=d.nextInt();
	        	String destination="Chennai";
	        	if(dp2==1)
	        	{
	        		System.out.println("your drop location Central");
	        	}if(dp2==2)
	        	{
	        		System.out.println("your drop Marina Beach");
	        	}if(dp2==3)
	        	{
	        		System.out.println("your drop VR Chennai");
	        	}if(dp2==4)
	        	{
	        		System.out.println("your drop location Fort Museum");
	        	}System.out.println("\n");
	        	System.out.println("your booking from "+city+" to "+destination+"\n");
	        }break;
	        case 3:
	        {
	        	System.out.println("You have choosen Mumbai as your Destination place :");
	        	System.out.println("choose your location point to drop :\n1.Railway Station\n2.Beach\n3.old mumbai\n4.stadium");
	        	int bngtomum=600;
	        	bngtomum*=kpp;
	             adultprice+=bngtomum;
	             childprice+=bngtomum;
	             local+="Mumbai";
	        	int dp=d.nextInt();
	        	String destination="Mumbai";
	        	if(dp==1)
	        	{
	        		System.out.println("your drop location Railway Station");
	        	}if(dp==2)
	        	{
	        		System.out.println("your drop location Beach");
	        	}if(dp==3)
	        	{
	        		System.out.println("your drop location old mumbai");
	        	}if(dp==4)
	        	{
	        		System.out.println("your drop location stadium");
	        	}System.out.println("\n");
	        	System.out.println("your booking from "+city+" to "+destination+"\n");
	        }break;
	        case 4:
	        {
	        	System.out.println("You have choosen Delhi as your Destination place :");
	        	System.out.println("choose your location point to drop :\n1.India Gate\n2.Raj Ghat\n3.Minister Road\n4.President House");
	        	int bngtodel=900;
	        	bngtodel*=kpp;
	             adultprice+=bngtodel;
	             childprice+=bngtodel;
	             local+="Delhi";
	        	int dp=d.nextInt();
	        	String destination="Delhi";
	        	if(dp==1)
	        	{
	        		System.out.println("your drop location India Gate");
	        	}if(dp==2)
	        	{
	        		System.out.println("your drop location Raj Ghat");
	        	}if(dp==3)
	        	{
	        		System.out.println("your drop location Minister Road");
	        	}if(dp==4)
	        	{
	        		System.out.println("your drop location President House");
	        	}System.out.println("\n");
	        	System.out.println("your booking from "+city+" to "+destination+"\n");
	        }break;
	        }}
	        if(bdcity==3)
	        {
	        	System.out.println("You have choosen Chennai as your BOarding place :");
	        	System.out.println("choose your location point to Pickup :\n1.Central\n2.Marina Beach\n3.VR Chennai\n4.Fort Museum");
	        	int dp2=d.nextInt();
	        	String city="Chennai";
	        	place+="Chennai";
	        	if(dp2==1)
	        	{
	        		System.out.println("your drop location Central");
	        	}if(dp2==2)
	        	{
	        		System.out.println("your drop Marina Beach");
	        	}if(dp2==3)
	        	{
	        		System.out.println("your drop VR Chennai");
	        	}if(dp2==4)
	        	{
	        		System.out.println("your drop location Fort Museum");
	        	}
	        	System.out.println("Choose your destination location : \n1.Hyderabad\n2.Bengaloru\n3.mumbai\n4.delhi");
	            int des1=d.nextInt();
	            switch(des1)
	            {
	            case 1:
	            {
	            	System.out.println("You have choosen Hyderabad as your Destination place :");
	            	System.out.println("choose your location point to drop :\n1.Uppal\n2.L.B Nagar\n3.Ameerpet\n4.KPHB");
	            	int chetohyd=500;
	            	chetohyd*=kpp;
	                 adultprice+=chetohyd;
	                 childprice+=chetohyd;
	                 local+="Hyderabad";
	            	int dp1=d.nextInt();
	            	String destination="Hyderabad";
	            	if(dp1==1)
	            	{
	            		System.out.println("your drop location Uppal");
	            	}if(dp1==2)
	            	{
	            		System.out.println("your drop location L.B Nagar");
	            	}if(dp1==3)
	            	{
	            		System.out.println("your drop location Ameerpet");
	            	}if(dp1==4)
	            	{
	            		System.out.println("your drop location KPHB");
	            	}System.out.println("\n");
	            	System.out.println("your booking from "+city+" to "+destination+"\n");
	            }break;
	            case 2:
	            {
	            	System.out.println("You have choosen Bengalore as your Destination place :");
	            	System.out.println("choose your location point to drop :\n1.Marthalli\n2.hebbal\n3.Silkboard\n4.Electronic City");
	            	int hydtobng=605;
	                hydtobng*=kpp;
	                 adultprice+=hydtobng;
	                 childprice+=hydtobng;
	                 local+="Bengalore";
	            	int dp=d.nextInt();
	            	String destination="Bengalore";
	            	if(dp==1)
	            	{
	            		System.out.println("your drop location Marthalli");
	            	}if(dp==2)
	            	{
	            		System.out.println("your drop location hebbal");
	            	}if(dp==3)
	            	{
	            		System.out.println("your drop location Silkboard");
	            	}if(dp==4)
	            	{
	            		System.out.println("your drop location Electronic City");
	            	}System.out.println("\n");
	            	System.out.println("your booking from "+city+" to "+destination+"\n");
	            }break;
	            case 3:
	            {
	            	System.out.println("You have choosen Mumbai as your Destination place :");
	            	System.out.println("choose your location point to drop :\n1.Railway Station\n2.Beach\n3.old mumbai\n4.stadium");
	            	int bngtomum=600;
	            	bngtomum*=kpp;
	                 adultprice+=bngtomum;
	                 childprice+=bngtomum;
	                 local+="Mumbai";
	            	int dp=d.nextInt();
	            	String destination="Mumbai";
	            	if(dp==1)
	            	{
	            		System.out.println("your drop location Railway Station");
	            	}if(dp==2)
	            	{
	            		System.out.println("your drop location Beach");
	            	}if(dp==3)
	            	{
	            		System.out.println("your drop location old mumbai");
	            	}if(dp==4)
	            	{
	            		System.out.println("your drop location stadium");
	            	}System.out.println("\n");
	            	System.out.println("your booking from "+city+" to "+destination+"\n");
	            }break;
	            case 4:
	            {
	            	System.out.println("You have choosen Delhi as your Destination place :");
	            	System.out.println("choose your location point to drop :\n1.India Gate\n2.Raj Ghat\n3.Minister Road\n4.President House");
	            	int bngtodel=900;
	            	bngtodel*=kpp;
	                 adultprice+=bngtodel;
	                 childprice+=bngtodel;
	                 local+="Delhi";
	            	int dp=d.nextInt();
	            	String destination="Delhi";
	            	if(dp==1)
	            	{
	            		System.out.println("your drop location India Gate");
	            	}if(dp==2)
	            	{
	            		System.out.println("your drop location Raj Ghat");
	            	}if(dp==3)
	            	{
	            		System.out.println("your drop location Minister Road");
	            	}if(dp==4)
	            	{
	            		System.out.println("your drop location President House");
	            	}System.out.println("\n");
	            	System.out.println("your booking from "+city+" to "+destination+"\n");
	            }break;
	            }}
	            if(bdcity==4)
	            {
	            	System.out.println("You have choosen Mumbai as your BOarding City :");
	            	System.out.println("choose your location point to Pickup :\n1.Railway Station\n2.Beach\n3.old mumbai\n4.stadium");
	            	int dp3=d.nextInt();
	            	String city="Mumbai";
	            	place+="Mumbai";
	            	if(dp3==1)
	                	{
	                		System.out.println("your Pickup location Railway Station");
	                	}if(dp3==2)
	                	{
	                		System.out.println("your Pickup location Beach");
	                	}if(dp3==3)
	                	{
	                		System.out.println("your Pickup location old mumbai");
	                	}if(dp3==4)
	                	{
	                		System.out.println("your Pickup location stadium");
	                	}
	                	System.out.println("Choose your destination location : \n1.Hyderabad\n2.Bengaloru\n3.Chennai\n4.delhi");
	                    int des3=d.nextInt();
	                    switch(des3)
	                    {
	                    case 1:
	                    {
	                    	System.out.println("You have choosen Hyderabad as your Destination place :");
	                    	System.out.println("choose your location point to drop :\n1.Uppal\n2.L.B Nagar\n3.Ameerpet\n4.KPHB");
	                    	int hydtomum=390;
	                    	hydtomum*=kpp;
	                         adultprice+=hydtomum;
	                         childprice+=hydtomum;
	                         local+="Hyderabad";
	                    	int dp1=d.nextInt();
	                    	String destination="Hyderabad";
	                    	if(dp1==1)
	                    	{
	                    		System.out.println("your drop location Uppal");
	                    	}if(dp1==2)
	                    	{
	                    		System.out.println("your drop location L.B Nagar");
	                    	}if(dp1==3)
	                    	{
	                    		System.out.println("your drop location Ameerpet");
	                    	}if(dp1==4)
	                    	{
	                    		System.out.println("your drop location KPHB");
	                    	}System.out.println("\n");
	                    	System.out.println("your booking from "+city+" to "+destination+"\n");
	                    }break;
	                    case 2:
	                    {
	                    	System.out.println("You have choosen Bengalore as your Destination place :");
	                    	System.out.println("choose your location point to drop :\n1.Marthalli\n2.hebbal\n3.Silkboard\n4.Electronic City");
	                    	int mumtobng=680;
	                    	 mumtobng*=kpp;
	                         adultprice+=mumtobng;
	                         childprice+=mumtobng;
	                         local+="Bengalore";
	                    	int dp=d.nextInt();
	                    	String destination="Bengalore";
	                    	if(dp==1)
	                    	{
	                    		System.out.println("your drop location Marthalli");
	                    	}if(dp==2)
	                    	{
	                    		System.out.println("your drop location hebbal");
	                    	}if(dp==3)
	                    	{
	                    		System.out.println("your drop location Silkboard");
	                    	}if(dp==4)
	                    	{
	                    		System.out.println("your drop location Electronic City");
	                    	}System.out.println("\n");
	                    	System.out.println("your booking from "+city+" to "+destination+"\n");
	                    }break;
	                    case 3:
	                    {
	                    	System.out.println("You have choosen Chennai as your Destination place :");
	                    	System.out.println("choose your location point to drop :\n1.Central\n2.Marina Beach\n3.VR Chennai\n4.Fort Museum");
	                    	int mumtoche=470;
	                    	mumtoche*=kpp;
	                         adultprice+=mumtoche;
	                         childprice+=mumtoche;
	                         local+="Chennai";
	                    	int dp4=d.nextInt();
	                    	String destination="Chennai";
	                    	if(dp4==1)
	                    	{
	                    		System.out.println("your drop location Central");
	                    	}if(dp4==2)
	                    	{
	                    		System.out.println("your drop Marina Beach");
	                    	}if(dp4==3)
	                    	{
	                    		System.out.println("your drop VR Chennai");
	                    	}if(dp4==4)
	                    	{
	                    		System.out.println("your drop location Fort Museum");
	                    	}System.out.println("\n");
	                    	System.out.println("your booking from "+city+" to "+destination+"\n");
	                    }break;
	                    case 4:
	                    {
	                    	System.out.println("You have choosen Delhi as your Destination place :");
	                    	System.out.println("choose your location point to drop :\n1.India Gate\n2.Raj Ghat\n3.Minister Road\n4.President House");
	                    	int mumtodel=560;
	                    	mumtodel*=kpp;
	                         adultprice+=mumtodel;
	                         childprice+=mumtodel;
	                         local+="Delhi";
	                    	int dp=d.nextInt();
	                    	String destination="Delhi";
	                    	if(dp==1)
	                    	{
	                    		System.out.println("your drop location India Gate");
	                    	}if(dp==2)
	                    	{
	                    		System.out.println("your drop location Raj Ghat");
	                    	}if(dp==3)
	                    	{
	                    		System.out.println("your drop location Minister Road");
	                    	}if(dp==4)
	                    	{
	                    		System.out.println("your drop location President House");
	                    	}System.out.println("\n");
	                    	System.out.println("your booking from "+city+" to "+destination+"\n");
	                    }break;
	                    }
	            }
	            if(bdcity==5)
	            {
	            	System.out.println("You have choosen Delhi as your BOarding City :");
	            	System.out.println("choose your location point to Pickup :\n1.India Gate\n2.Raj Ghat\n3.Minister Road\n4.President House");
	            	int dp4=d.nextInt();
	            	String city="Delhi";
	            	place+="Delhi";
	            	if(dp4==1)
	            		{
	                		System.out.println("your Pickup location India Gate");
	                	}if(dp4==2)
	                	{
	                		System.out.println("your Pickup location Raj Ghat");
	                	}if(dp4==3)
	                	{
	                		System.out.println("your Pickup location Minister Road");
	                	}if(dp4==4)
	                	{
	                		System.out.println("your Pickup location President House");
	                	}
	                	System.out.println("Choose your destination location : \n1.Hyderabad\n2.Bengaloru\n3.Chennai\n4.Mumbai");
	                    int des3=d.nextInt();
	                    switch(des3)
	                    {
	                    case 1:
	                    {
	                    	System.out.println("You have choosen Hyderabad as your Destination place :");
	                    	System.out.println("choose your location point to drop :\n1.Uppal\n2.L.B Nagar\n3.Ameerpet\n4.KPHB");
	                    	int deltohyd=780;
	                    	deltohyd*=kpp;
	                         adultprice+=deltohyd;
	                         childprice+=deltohyd;
	                         local+="Hyderabad";
	                    	int dp1=d.nextInt();
	                    	String destination="Hyderabad";
	                    	if(dp1==1)
	                    	{
	                    		System.out.println("your drop location Uppal");
	                    	}if(dp1==2)
	                    	{
	                    		System.out.println("your drop location L.B Nagar");
	                    	}if(dp1==3)
	                    	{
	                    		System.out.println("your drop location Ameerpet");
	                    	}if(dp1==4)
	                    	{
	                    		System.out.println("your drop location KPHB");
	                    	}System.out.println("\n");
	                    	System.out.println("your booking from "+city+" to "+destination+"\n");
	                    }break;
	                    case 2:
	                    {
	                    	System.out.println("You have choosen Bengalore as your Destination place :");
	                    	System.out.println("choose your location point to drop :\n1.Marthalli\n2.hebbal\n3.Silkboard\n4.Electronic City");
	                    	int deltobng=880;
	                    	 deltobng*=kpp;
	                         adultprice+=deltobng;
	                         childprice+=deltobng;
	                         local+="Bengalore";
	                    	int dp=d.nextInt();
	                    	String destination="Bengalore";
	                    	if(dp==1)
	                    	{
	                    		System.out.println("your drop location Marthalli");
	                    	}if(dp==2)
	                    	{
	                    		System.out.println("your drop location hebbal");
	                    	}if(dp==3)
	                    	{
	                    		System.out.println("your drop location Silkboard");
	                    	}if(dp==4)
	                    	{
	                    		System.out.println("your drop location Electronic City");
	                    	}System.out.println("\n");
	                    	System.out.println("your booking from "+city+" to "+destination+"\n");
	                    }break;
	                    case 3:
	                    {
	                    	System.out.println("You have choosen Chennai as your Destination place :");
	                    	System.out.println("choose your location point to drop :\n1.Central\n2.Marina Beach\n3.VR Chennai\n4.Fort Museum");
	                    	int deltoche=740;
	                    	deltoche*=kpp;
	                         adultprice+=deltoche;
	                         childprice+=deltoche;
	                         local+="Chennai";
	                    	int dp5=d.nextInt();
	                    	String destination="Chennai";
	                    	if(dp5==1)
	                    	{
	                    		System.out.println("your drop location Central");
	                    	}if(dp5==2)
	                    	{
	                    		System.out.println("your drop Marina Beach");
	                    	}if(dp5==3)
	                    	{
	                    		System.out.println("your drop VR Chennai");
	                    	}if(dp5==4)
	                    	{
	                    		System.out.println("your drop location Fort Museum");
	                    	}System.out.println("\n");
	                    	System.out.println("your booking from "+city+" to "+destination+"\n");
	                    }break;
	                    case 4:
	                    {
	                    	System.out.println("You have choosen Mumbai as your Destination place :");
	                    	System.out.println("choose your location point to drop :\n1.Railway Station\n2.Beach\n3.old mumbai\n4.stadium");
	                    	int deltomum=490;
	                    	deltomum*=kpp;
	                         adultprice+=deltomum;
	                         childprice+=deltomum;
	                         local+="Mumbai";
	                    	int dp=d.nextInt();
	                    	String destination="Mumbai";
	                    	if(dp==1)
	                    	{
	                    		System.out.println("your drop location Railway Station");
	                    	}if(dp==2)
	                    	{
	                    		System.out.println("your drop location Beach");
	                    	}if(dp==3)
	                    	{
	                    		System.out.println("your drop location old mumbai");
	                    	}if(dp==4)
	                    	{
	                    		System.out.println("your drop location stadium");
	                    	}System.out.println("\n");
	                    	System.out.println("your booking from "+city+" to "+destination+"\n");
	                    }break;
	                    }
	            }
	            if(bdcity>5)
	            {
	            	System.out.println("Mr/Miss. "+username+" Entered wrong city code");
	            	System.out.println("Plz...Enter Correct city code "+username);
	            }
	            System.out.println("Enter date of Travel ");
	            d.nextLine();
	            String da=d.nextLine();
	            System.out.println("SELECT SEATS for adults and child required");
				System.out.println("Eneter your required members :\n1.ADULT\n2.Child");
				int n=d.nextInt();
				int nadults=0,nchild=0;
				while(n>0)
				{
					if(n==1){
					System.out.println("Enter no of Adults :");
					int nadults1=d.nextInt();
					nadults=nadults1;
				}
					else
				{
						System.out.println("Enter no of Childs :");
						int nchild1=d.nextInt();
				     	nchild=nchild1;
				}
					System.out.println("3.for required child seats\n0.for not required");
					int n1=d.nextInt();
					n=n1;
					
				}
				System.out.println("-----------------------------------------------------------------------------------");
				System.out.println("                        ** Your Billing Details **");
				System.out.println("adultprice is : "+(adultprice*=nadults));
				System.out.println("childprice is : "+(childprice*=nchild));
				float totalprice=adultprice+childprice;
				System.out.println("total bill for travelling : "+totalprice+"\n");
				System.out.println("Thank You for chooseing Allam Travells you won 16%Discount on Dasara Festival");
				System.out.println("Your Total Bill After Discount is : "+(totalprice=((float)(totalprice-(totalprice*0.16))))+"\n");
				System.out.println("Tickets Booked on Date : "+da);
				System.out.println("Your Tickets booked from "+place+" TO "+local);
				System.out.println("Your booking details send to your phone number : +91 " +ph+"\n");
				Date date = new Date();    
			    System.out.println("Your booking time : "+date); 
				System.out.println("--------------------Thank You "+username+" Have a Safe Journey-------------------");
				System.out.println(LocalDate.now());
	    	}
	    	else {
	    		System.out.println("You entered wrong password plz... Try again ....Thank you....");
	    		System.out.println("1.Reset Password\n2.exit");
	    		int p1=d.nextInt();
	            	if(p1==1)
	            	{
	            		System.out.println("Sorry!....Software under upgradation Plz....Try again......♡ ♥");
	            	    System.out.println("write your opinion...");
	            	    String msg=(d.next());
	            	    
	            	   
	            	    System.out.println(msg);
	            	}
	                if(p1==2)
	                {
	                	System.out.println("Thank You "+username+" for your valuable Time....♡ ♥\nJai BHARAT......Jai HIND.....♡♡♡♡♡");
	                }
	    	}//else
	    }
	d.close();}//class
}
