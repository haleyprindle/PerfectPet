import java.util.*;
public class PetSimulator{
    public static void main(String [] args){
        //code goes here
        Scanner input = new Scanner(System.in);

        String pet = "";
        System.out.println("Enter your favorite color (Either red, blue or green): ");
        String favoriteColor = input.nextLine().toLowerCase();
        System.out.println("Enter your favorite season (winter, spring, summer, fall): ");
        String favoriteSeason = input.nextLine().toLowerCase();
        System.out.println("Enter your name: ");
        String name = input.nextLine().toLowerCase();
        input.close();
        boolean isThereAConsonant;
        String firstLetter = name.substring(0,1);
        int i = 0;

        while (++i < name.length()) {
        if ("abcdefghijklmnopqrstuvwxyz".indexOf(name.substring(i, i + 1).toLowerCase()) < 0) 
        {
          System.out.println ("Please input letters only.");  
              return;  
        }  //this is a letter
                
        }

        while (i++ < favoriteColor.length()) {
        if ("abcdefghijklmnopqrstuvwxyz".indexOf(name.substring(i, i + 1).toLowerCase()) < 0) 
        {
          System.out.println ("Please input letters only."); 
              return;  
        }  //this is a letter
                
        }

        while (i < favoriteSeason.length()) {
        if ("abcdefghijklmnopqrstuvwxyz".indexOf(name.substring(i, i + 1).toLowerCase()) < 0) 
        {
         System.out.println ("Please input letters only.");
              return;
        }  //this is a letter
                
        }

         if(!firstLetter.equals("a") &&  !firstLetter.equals("e") && !firstLetter.equals("i") && !firstLetter.equals("o") && !firstLetter.equals("u"))
        {
            isThereAConsonant = true;
        } else {
            isThereAConsonant = false;
        }


          if (favoriteColor.equals("blue"))
          {
            if (favoriteSeason.equals("fall"))
            {
                pet = "alligator";
            }
            else
            {
                if (favoriteSeason.equals("spring"))
                {
                    pet = "ostritch";
                }
                else
                {
                    if ((!favoriteSeason.equals("summer")) && isThereAConsonant == true)
                    {
                        if (!favoriteSeason.equals("fall"))
                        {
                            if (!pet.equals("ostritch") )
                            {
                            pet = "axolotl";   
                            }
                    }
                        
                    }
                }
            }
          }

          if(favoriteColor.equals("green"))
          {
            if(isThereAConsonant == true && favoriteSeason.equals("winter"));
            {
                pet = "giraffe";
            }

            if (!favoriteSeason.equals("fall" )&& !pet.equals("giraffe"))
            {
                pet = "dog";
            }
          }

          if (favoriteColor.equals("red")) 
          {
            if(isThereAConsonant == true)
            {
                pet = "panda";
            }
            else
            {
                pet = "porcupine";
            }
          }

          if(favoriteSeason.equals("summer") && (!pet.equals("porcupine")))
          {
            if(!pet.equals("dog"))
            {
                if(!pet.equals("panda"))
                {
                 pet = "pony";   
                }
            }
            
          }
          
          if(pet.equals(""))
          {
            pet = "rock";
          }
        System.out.println("Your perfect pet is: " + pet);
    }
}
