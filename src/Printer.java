public class Printer<T>{
    private T value;
void setValue(T valeu){
    this.value=valeu;
}
T getValue(){
    return value;
}
void printValue(){
    System.out.println("Value is " + value);
}
void refresh(){
    this.value=null;
}
}
