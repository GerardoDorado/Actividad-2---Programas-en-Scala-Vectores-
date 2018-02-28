

object VectoresCalificaciones {
  def main(args: Array[String]): Unit = {
    val calificaciones1=Array[Int](60, 89, 90, 100, 0, 99)
    val calificaciones2=Array[Int](56, 89, 70, 100, 5, 77)
    val calificaciones3=Array[Int](65, 59, 90, 100, 6, 66)
    val calificaciones4=Array[Int](6, 69, 80, 100, 0, 55)
    
    var promedioP1=0
    var promedioP2=0
    var promedioP3=0
    var promedioP4=0
    
    for (i<-calificaciones1) yield promedioP1+=i
    for (i<-calificaciones2) yield promedioP2+=i
    for (i<-calificaciones3) yield promedioP3+=i
    for (i<-calificaciones4) yield promedioP4+=i
    
    val promedioGeneral=(promedioP1/calificaciones1.length)+(promedioP2/calificaciones2.length)+
      (promedioP3/calificaciones3.length)+(promedioP4/calificaciones4.length)
      
    println("Promedio parcial: " + promedioP1/calificaciones1.length)
    println("Promedio parcial: " + promedioP2/calificaciones2.length)
    println("Promedio parcial: " + promedioP3/calificaciones3.length)
    println("Promedio parcial: " + promedioP4/calificaciones4.length)    
    
    println("Proemedio General: "+promedioGeneral/4)
    
    obtenerPromedio(calificaciones1, calificaciones2, calificaciones3, calificaciones4)
  }
  
  def obtenerPromedio(vector1: Array[Int], vector2: Array[Int], vector3: Array[Int], vector4: Array[Int]):Unit={
    var promedio=0
    for(x<-0 until vector1.length){
     if(x==0){
       promedio = vector1(x)+vector2(x)+vector3(x)+vector4(x)
       println("Promedio de la primer materia: "+ promedio/4)
     }else if(x==1){
       promedio = vector1(x)+vector2(x)+vector3(x)+vector4(x)
       println("Promedio de la Segunda materia: "+ promedio/4)
     }else if(x==2){
       promedio = vector1(x)+vector2(x)+vector3(x)+vector4(x)
       println("Promedio de la Tercer materia: "+ promedio/4)
     }else if(x==3){
       promedio = vector1(x)+vector2(x)+vector3(x)+vector4(x)
       println("Promedio de la Cuarta materia: "+ promedio/4)
     }else if(x==4){
       promedio = vector1(x)+vector2(x)+vector3(x)+vector4(x)
       println("Promedio de la Quinta materia: "+ promedio/4)
     }else if(x==5){
       promedio = vector1(x)+vector2(x)+vector3(x)+vector4(x)
       println("Promedio de la Sexta materia: "+ promedio/4)
     }
    }
  }
}