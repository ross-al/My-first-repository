
System.out.print("Adding text for first commit. ");
System.out.print("Testing a git push to collaborative repo ");

System.out.print("If I give you £1, how many Euros will you give me? ");

double euroOverPoundRatio = Double.parseDouble(System.console().readLine());
System.out.print("If I give you 1€, how many Sterling pounds will you give me? ");
double poundOverEuroRatio = Double.parseDouble(System.console().readLine());
System.out.println("OK");
boolean finished = false;
while (!finished) {
    System.out.println();
    System.out.println("What would you like to do?");
    System.out.println("   1 - Exchange pounds into euro");
    System.out.println("   2 - Exchange euro into pounds");
    System.out.println("   0 - Exit the program");
    System.out.println();
    System.out.print(  "> ");
    int choice = Integer.parseInt(System.console().readLine());
    switch (choice) {
    case 1:
	  System.out.print("How many pounds would you like to convert? ");
	  double pounds = Double.parseDouble(System.console().readLine());
	  double euro   = pounds * euroOverPoundRatio;
	  System.out.println("£" + pounds + " will give you " + euro + "€");
	  break;
    case 2: 
	  System.out.print("How many euros would you like to convert? ");
	  euro   = Double.parseDouble(System.console().readLine());
	  pounds = euro * poundOverEuroRatio;
	  System.out.println(euro + "€ will give you £" + pounds);
	  break;
    case 0: 
	  finished = true;
	  break;
    default: 
	  System.out.println("Sorry, but that is not a valid option. Please try again");
    }	  
}
System.out.println("Exiting the program");

