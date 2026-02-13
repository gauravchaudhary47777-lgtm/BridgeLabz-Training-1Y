class ConstructorDemo{
int id;
string name;
int age;

public ConstructorDemo(){
  System.out.println("Contructor Program");
  }
Public ConstructorDemo(int id, String name,int age){
  this.id=id;
  this.name= name;
  this.age=age;
}
 
 public static void main(String args[]){
    ConstructorDemo cd= new ConstructorDemo(1,"jay",20);
	System.out.println(cd);
  
}
}