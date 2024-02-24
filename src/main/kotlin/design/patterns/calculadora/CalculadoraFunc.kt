package design.patterns.design.patterns.calculadora

class CalculadoraFunc{
    fun suma(valA: Int, valB: Int): Int{
        return valA + valB
    }
    fun resta(valA: Int, valB: Int): Int{
        return valA - valB
    }
    fun multiplicacion(valA: Int, valB: Int): Int {
        return valA * valB
    }
    fun division(valA: Int, valB: Int): Int{
        if(valB == 0){
            throw IllegalArgumentException("No se puede dividir entre 0")
        }
        else{
        return valA/valB
        }
    }
}