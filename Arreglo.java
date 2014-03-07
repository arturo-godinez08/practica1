public class Arreglo{

double a[];
void crear(){
int b;
System.out.println("¿cuantas celdas ocupas?");
b=Lector.leeInt();
a=new double[b];
}

void llenar(){
for(int i=0;i<a.length;i++){
System.out.println("ingresa la calificacion #"+i);
a[i]=Lector.leeInt();
}/Volumes/NO NAME/programacion 2/Sobrecarga.class
}
void mostrar(){
for(int i=0;i<a.length;i++)
System.out.println(a[i]);
}
void alta(){
double c=0;
for(int i=0;i<a.length;i++){
if(a[i]>c)
c=a[i];
}
System.out.print("la calificacion mas alta es"+c);
}

public static void main(String args[]){
Arreglo x=new Arreglo(); 
int opc;
do{
System.out.println("\n (1)crear \n (2)llenar \n(3)mostrar \n (4)calificacion mas alta \n");
opc=Lector.leeInt();
switch (opc){

case 1:
      x.crear();
      break;
case 2:x.llenar();
      break;
case 3:
      x.mostrar();
      break;
case 4:
      x.alta();
      break;
default:
System.out.println("the end hgiho");
}
}while(opc<5);
}
}

      