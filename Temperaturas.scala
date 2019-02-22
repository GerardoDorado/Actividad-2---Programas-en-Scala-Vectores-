import scala.collection.mutable.ArrayBuffer

object Temperaturas {
  def main(args: Array[String]): Unit = {
    val numeros = ArrayBuffer[Int]()
    val temperaturasAlmacenadas = ArrayBuffer[Int]()
    
    val r = new scala.util.Random
    
    for(i<-0 to 23){ 
      numeros+=i
      numeros+=r.nextInt(50)
    }
    
    println("Contenido del vector: \n"+numeros)
    
    
    var i=1 
    var bandera=false
    var contador=0
    
    while(i<numeros.length){
      if(numeros(i)==25){
        println("Temperatura: "+numeros(i)+" hora: "+numeros(i-1))
        
        temperaturasAlmacenadas+=numeros(i-1)
        temperaturasAlmacenadas+=numeros(i)
        contador+=1
        bandera=true
      }
      i+=2
    }
    
    if(bandera==false){
      println("No se encontro ninguna temperatura igual a 25")
    }else{
      var j=0
      var promedio=0
      
      println(temperaturasAlmacenadas)
      
      while(j<temperaturasAlmacenadas.length){
        promedio += temperaturasAlmacenadas(j)
        j+=2
      }
      
      println("Promedio: "+(promedio/contador))
    }
    
  }
}