//Haley Prindle 
//10/17/25
//Description: Accurately calculates the proper pet for anyone
import java.util.*;
public class PetSimulator{
    public static void main(String [] args){
        //code goes here
        Scanner input = new Scanner(System.in);
        String[] validColors = {"red", "blue", "green"};
        String[] validSeasons = {"winter", "spring", "summer", "fall"};
        String pet = "";
        boolean valid= false;
        String favoriteColor =null;

        while(!valid) { // loop until you get a valid color
            System.out.println("Enter your favorite color (Either red, blue or green): ");
             favoriteColor = input.nextLine().toLowerCase();
            for(int j=0;j<validColors.length;j++) // loop over valid colors to see if there is a match
            {
                if(validColors[j].equals(favoriteColor)){
                    valid = true; // stop prompting the user for another color
                    break; // found it so stop checking the rest of the colors
                }
            }
    }
            valid = false;
            String favoriteSeason = null;
            while(!valid) {
            System.out.println("Enter your favorite season (winter, spring, summer, fall): ");
            favoriteSeason = input.nextLine().toLowerCase();
            for(String s :validSeasons){ 
                if(s.equals(favoriteSeason)){
                    valid = true;
                    break;
                }
            }
    }
        
String name = "";
           
     
        valid = false;
        while(!valid){
            System.out.println("Enter your name: ");
            name = input.nextLine().toLowerCase();
            if(name.length() == 0) // check for empty string
                continue; // User entered "", so restart loop to prompt again
            
            int i = 0;
            valid = true; // Start with assumption that the input is valid
        while (i < name.length()) { // iterate through all chars and check that each is a letter
                String s = name.substring(i, i + 1);
            if ("abcdefghijklmnopqrstuvwxyz".indexOf(s) < 0) // check if character is invalid
            {
                System.out.println ("Please input letters only.");  
                valid   = false; // we don't have a valid input, so start prompt loop again
                break;  // Found one bad character, no need to check the rest
            }   
            i++; // check the next character

        }
    }

        input.close();
    
        boolean isThereAConsonant;
        String firstLetter = "";
        if(name.length()>0) firstLetter = name.substring(0,1);

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
                    pet = "ostrich";
                }
                else
                {
                    if ((!favoriteSeason.equals("summer")) && isThereAConsonant == true)
                    {
                        if (!favoriteSeason.equals("fall"))
                        {
                            if (!pet.equals("ostrich") )
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
            if(isThereAConsonant == true && favoriteSeason.equals("winter"))
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
