
package conversor;


public  class Conversorconcreto extends AConversor {

    @Override
    double grado2radian() {
          
        return (dato*Math.PI)/180;
        
    }

    @Override
    double farenheit2kelvin() {
        
       return (dato+459.67)*5/9; 
            


    }
}
