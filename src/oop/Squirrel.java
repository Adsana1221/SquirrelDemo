package squirrel;


public class Squirrel{

   // instance variable

 String colour;
 int age;
 int weight; 
 String Name;

public Squirrel(String newColour, int newAge, int newWeight, String newName){

  this.colour = newColour;
  this.age = newAge;
  this.weight = newWeight;
  this.name = newName; 

}

public void jump(int intHeight){
    System.out.println(this.name + "jumps" + intHeight + "meters)";
  }


public void identifiesPredators(String strIdentifiesPredators){
  System.out.println(this.name + "identifies a predator"+ strIdentifiesPredators);
  
}
  

public void makeNoise(String strmakeNoise){
    System.out.println(this.name + "is making noises;" + strmakeNoise);
  
}


}












}