import java.util.Scanner;
public class myApp{
    public static void main(String[] argv){
      int option;   //question number.

		  Scanner scanf = new Scanner(System.in);
      do{
          System.out.print("\n=====================================\nEnter exercise number or 0 to exit: \n=====================================");
          String exNoF = scanf.next();    //Take input from user in form of string
          String exNoI = exNoF.replace(".", "");  //Remove '.' form input string
          option = Integer.parseInt(exNoI);   //Convert input into integer
          if((option <21) || (option > 223)){ // if input is not valid
            if (option != 0){
              System.out.println("Invalid value entered\n");
            }
          }
          else                                // else valid input
          {
              if((int)(option/100)==0)
                  option = option%10;
              else
                  option = option%100;

              chapter2.showQuestion(option);
              switch (option){
              case 1: //exercise 2.1
                final double absoluteZero = 273.15;
                System.out.print("Key in the Celsius Temperature: ");
                double temp = scanf.nextDouble();
                temp += absoluteZero;
                System.out.println("The Temperature in Kelvin is: " + temp);
              break;
              case 2: //exercise 2.2
                final double PIE = 3.14159;
                double area, volume;
                System.out.print("Enter the radius of the cylinder: ");
                double radius = scanf.nextDouble();
                System.out.print("Enter the length of the cylinder: ");
                double length = scanf.nextDouble();
                area = PIE * radius * radius;
                area =(Math.round(area * 100)) / 100.0; //Round the area to two decimal places
                volume = area * length;
                System.out.println("The area of the cylinder is: " + area + "\nThe volume of the cylinder is: " + volume);
              break;
              case 3:
                final double FeetToMeter = 0.305; //One feet is equal to 0.305 meters
                double meters;
                System.out.print("Enter feet: ");
                double feet = scanf.nextDouble();
                meters = feet * FeetToMeter;
                System.out.println(feet + " feet is " + meters + " meters");
              break;
              case 4:
                System.out.print("Enter weight in pounds: ");
                float pounds = scanf.nextFloat();
                double kilograms = pounds * 0.454;
                System.out.println("The weight in kilograms is: " + kilograms);
              break;
              case 5:
                System.out.print("Enter the subtotal: ");
                float subtotal = scanf.nextFloat();
                System.out.print("Enter the gratuity rate: ");
                float gratuity = scanf.nextFloat();
                gratuity /= 10;
                float total = subtotal + gratuity;
                System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
              break;
              case 6:
                System.out.println("Enter an integer between 0 to 1000");
                System.out.print("Integer: ");
                int num = scanf.nextInt();
                int x = num;
                int digitSum = 0;
                int len = 0;
                while (num >= 1){
                  num /= 10;
                  len++;
                }
                num = x;
                for (int i = 0; i <= len; i++){
                  digitSum += (num % 10);
                  num = num / 10;
                }
                System.out.println("The sum of digits is: " + digitSum);
              break;
              case 7:
                int years = 0;
                System.out.print("Key in the number of minutes: ");
                int minutes = scanf.nextInt();
                int hours = minutes / 60;
                int days = hours / 24;
                while (days >= 365){
                  years += 1;
                  days -= 365;
                }
                System.out.println("Days: " + days );
                System.out.println("Years: " + years );
              break;
              case 8:
                int zone = 0;
                long actualSeconds = 0;
                long milliSeconds = 0;
                long totalSeconds = 0;
                long totalMinutes = 0;
                long totalHours = 0;
                long actualMinutes = 0;
                long actualHours = 0;
                System.out.print("Enter the time zone offset to GMT: ");
                zone = scanf.nextInt();
                milliSeconds = System.currentTimeMillis();

                totalSeconds = milliSeconds / 1000;

                actualSeconds = totalSeconds % 60;

                totalMinutes = totalSeconds / 60;

                actualMinutes = totalMinutes % 60;

                totalHours = totalMinutes / 60;

                actualHours = totalHours % 24;
                actualHours += zone;
                System.out.println("Current time is " + actualHours + ":" + actualMinutes + ":" + actualSeconds);
              break;
              case 9:
                float initialVelocity, finalVelocity, timeSpan;
                double acceleration;
                System.out.print("Enter the starting velocity: ");
                initialVelocity = scanf.nextFloat();
                System.out.print("Enter the ending velocity: ");
                finalVelocity = scanf.nextFloat();
                System.out.print("Enter the time span: ");
                timeSpan = scanf.nextFloat();
                acceleration = (finalVelocity - initialVelocity) / timeSpan;
                acceleration = (Math.round(acceleration * 10000)) / 10000.0;
                System.out.print("The average acceleration is " + acceleration);
              break;
              case 10:
                System.out.print("Enter the amount of water: ");
                float water_amount = scanf.nextFloat();
                System.out.print("Enter the initial temperature of the water: ");
                float initial_temp = scanf.nextFloat();
                System.out.print("Enter the final temperature of the water: ");
                float final_temp = scanf.nextFloat();
                float energy = water_amount * (final_temp - initial_temp) * 4184;
                System.out.println("The energy required is " + energy + " joules");
              break;
              case 11:
                int population;
                double births, deaths, immigrants;
                final int START_POPULATION = 312032486;
                final double SECONDS_IN_YEAR = 31536000;
                final int BIRTH_RATE = 7;
                final int DEATH_RATE = 13;
                final int IMMIGRANT_RATE = 45;
                Scanner input = new Scanner(System.in);
                System.out.print ("Enter the numbers of years: ");
                years = input.nextInt();
                births = years * SECONDS_IN_YEAR / BIRTH_RATE;
                deaths = years * SECONDS_IN_YEAR / DEATH_RATE;
                immigrants = years * SECONDS_IN_YEAR / IMMIGRANT_RATE;
                population = (int) (START_POPULATION + births - deaths + immigrants);
                System.out.println("The population in " + years + " years is " + population);
              break;
              case 12:
                float velocity;
                double runwayLength;
                System.out.print("Key in the take-off speed: ");
                velocity = scanf.nextFloat();
                System.out.print("Key in the acceleration: ");
                acceleration = scanf.nextDouble();
                runwayLength = (Math.pow(velocity, 2)) / (2 * acceleration);
                runwayLength = (Math.round(runwayLength * 1000)) / 1000.0;
                System.out.println("The minimum runway length for this airplane is " + runwayLength);
              break;
              case 13:
                final double MONTHLY_INTEREST_RATE = 0.00417;
                double savingAmount, savedAmount;
                savedAmount = 0;
                System.out.print("Key in the monthly saving amount: ");
                savingAmount = scanf.nextFloat();
                savedAmount += savingAmount * (1 + MONTHLY_INTEREST_RATE);
                for (int i = 1; i <= 5; i++){
                  savedAmount = (savingAmount + savedAmount) * (1 + MONTHLY_INTEREST_RATE);
                }
                savedAmount = ((int)(savedAmount * 100)) / 100.0;
                System.out.println("The account value after six months is: " + savedAmount);
              break;
              case 14:
                final double INCH_TO_METER = 0.0254;
                final double POUND_TO_KG = 0.45359237;
                double weight, height, bmi;

                System.out.print("Enter the body weight in pounds: ");
                weight = scanf.nextDouble();
                weight = weight * POUND_TO_KG;
                System.out.print("Enter the body height in inches: ");
                height = scanf.nextDouble();
                height = height * INCH_TO_METER;
                bmi = weight / (Math.pow(height , 2));
                bmi = (Math.round(bmi * 10000)) / 10000.0;
                System.out.println("The BMI is "+ bmi);
              break;
              case 15:
                System.out.println("Enter the coordinates of the first point");
                System.out.print("x1: ");
                float x1 = scanf.nextFloat();
                System.out.print("y1: ");
                float y1 = scanf.nextFloat();
                System.out.println("Enter the coordinates of the second point");
                System.out.print("x2: ");
                float x2 = scanf.nextFloat();
                System.out.print("y2: ");
                float y2 = scanf.nextFloat();
                double distance = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
                distance = Math.pow(distance, 0.5);
                distance = ((int)(distance * 1000)) / 1000.0;
                System.out.println("The distance between the two entered point is: " + distance + " units");
              break;
              case 16:
                System.out.print("Enter the side of the hexagon: ");
                float side = scanf.nextFloat();
                side *= side;
                area = ((3 * Math.pow(3, 0.5)) / 2) * side;
                area = ((int)(area * 10000)) / 10000.0;
                System.out.println("The area of the hexagon is: " + area);
              break;
              case 17:        //exercise 2.17
                  //System.out.println("Under Construction yet\n");
                  System.out.println(Math.pow(2,3));
                  System.out.print("Enter the temperature in Fahrenheit between -58�F and 41�F: ");
                  float ta = scanf.nextFloat();
                  System.out.print("Enter the  wind speed (>=2) in miles per hour:");
                  float v =  scanf.nextFloat();
                  float  twc =   (float)((35.74 + 0.6215 * ta) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * ta * Math.pow(v, 0.16)));
                  System.out.print("The wind chill index is "+(float)twc);
              break;
              case 18:
                int i = 1;
                System.out.println("a    b    pow(a, b)");
                do{
                  System.out.println(i + "    " + (i + 1) + "    " + ((int)Math.pow(i, (i+1))));
                  i++;
                }while(i <= 5);
              break;
              case 19:
                System.out.println("Triangle area finder");
                System.out.println("Enter the coordinates of the triangle to get the area");
                System.out.println("Enter the first coordinate (x1,y1)");
                System.out.print("x1: ");
                x1 = scanf.nextFloat();
                System.out.print("y1: ");
                y1 = scanf.nextFloat();
                System.out.println("Enter the second coordinate (x2,y2)");
                System.out.print("x2: ");
                x2 = scanf.nextFloat();
                System.out.print("y2: ");
                y2 = scanf.nextFloat();
                System.out.println("Enter the third coordinate (x3,y3)");
                System.out.print("x3: ");
                float x3 = scanf.nextFloat();
                System.out.print("y3: ");
                float y3 = scanf.nextFloat();
                double side1 = SideCalculator(x1,y1,x2,y2);
                double side2 = SideCalculator(x2,y2,x3,y3);
                double side3 = SideCalculator(x3,y3,x1,y1);
                double sides_sum = (side1 + side2 + side3) / 2;
                area = sides_sum * (sides_sum - side1) * (sides_sum - side2) * (sides_sum - side3);
                area = Math.pow(area, 0.5);
                area = Math.round(area * 10) / 10.0;
                System.out.println("The area of the triangle is " + area);
              break;
              case 20:
                System.out.print("Enter current balance: ");
                float balance = scanf.nextFloat();
                System.out.print("Enter the annual percentage interest rate: ");
                float annualRate = scanf.nextFloat();
                double interest = balance * (annualRate/1200);
                interest = Math.round(interest * 10000) / 10000.0;
                System.out.println("The interest for the next month is " + interest);
              break;
              case 21:
                final int numberOfMonths = 12; //Number of months in a year
                System.out.print("Key in the investment amount: ");
                float investment = scanf.nextFloat();
                System.out.print("Key in the annual interest rate: ");
                float percentageRate = scanf.nextFloat();
                System.out.print("Key in the number of years: ");
                years = scanf.nextInt();
                percentageRate /= 100.0;
                percentageRate /= 12.0;
                years = years * numberOfMonths;
                double powerRate = Math.pow((1 + percentageRate), years);
                double futureInvestmentValue = investment * powerRate;
                futureInvestmentValue = ((int) (futureInvestmentValue * 100)) / 100.0;
                System.out.println("The future investment value is: $" + futureInvestmentValue);
              break;
              case 22:
               // Receive the amount
               System.out.println("Enter an amount in cents, for example to enter $11.56 enter 1156");
               System.out.print("Your amount: ");
               int amount = scanf.nextInt();
               System.out.println();
               System.out.println("Entered amount: $" + amount / 100 + "." + amount % 100);
               System.out.println("Meaning " + amount / 100 + " dollars and " + amount % 100 + " cents");
               System.out.println();
               int remainingAmount = amount;
               int numberOfOneDollars = remainingAmount / 100;
               remainingAmount = remainingAmount % 100;
               // Find the number of quarters in the remaining amount
               int numberOfQuarters = remainingAmount / 25;
               remainingAmount = remainingAmount % 25;
               // Find the number of dimes in the remaining amount
               int numberOfDimes = remainingAmount / 10;
               remainingAmount = remainingAmount % 10;
               // Find the number of nickels in the remaining amount
               int numberOfNickels = remainingAmount / 5;
               remainingAmount = remainingAmount % 5;
               // Find the number of pennies in the remaining amount
               int numberOfPennies = remainingAmount;
               // Display results
               System.out.println("Your amount in cent " + amount + " consists of");
               System.out.println(" " + numberOfOneDollars + " dollars");
               System.out.println(" " + numberOfQuarters + " quarters ");
               System.out.println(" " + numberOfDimes + " dimes");
               System.out.println(" " + numberOfNickels + " nickels");
               System.out.println(" " + numberOfPennies + " pennies");
              break;
              case 23: //exercise 2.23
                double tripCost;
                System.out.print("Enter the driving distance: ");
                distance = scanf.nextFloat();
                System.out.print("Enter miles per gallon: ");
                float efficiency = scanf.nextFloat();
                System.out.print("Enter price per gallon: ");
                float price = scanf.nextFloat();
                tripCost = (distance / efficiency) * price;
                tripCost = Math.round((tripCost * 100)) / 100.0;
                System.out.println("The cost of driving is: $" + tripCost);
              break;
              default:
                  System.out.println("Question "+option+" not implemented yet");
              }
          }
      }while(option != 0);
    }
    public static double SideCalculator(float x1, float y1, float x2, float y2){
      double coord1 = Math.pow((x1 - x2), 2);
      double coord2 = Math.pow((y1 - y2), 2);
      double side = Math.pow((coord1 + coord2), 0.5);
      return side;
    }
}
