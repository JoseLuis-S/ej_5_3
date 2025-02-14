class Coche(val nombre: String = "Desconocido"): EncendidoApagado, Vehiculo {
    override var motorEncendido: Boolean = false
    override var kmHora: Int = 0
        set(value) {
            require(value > 0) { "No puede tener una velocidad negativa." }
            field = value
        }

    override fun encender() {
        motorEncendido = true
        println("Coche encendido.")
    }

    override fun apagar() {
        motorEncendido = false
        kmHora = 0
        println("Coche apagado.")
    }

    override fun acelerar(x: Int) {
        if (motorEncendido) {
            kmHora += x
            println("Velocidad actual: $kmHora")
        } else println("El motor debe estar encendido.")
    }

    override fun frenar(x: Int) {
        if (motorEncendido) {
            kmHora -= x
            println("Velocidad actual: $kmHora")
        } else println("El motor debe estar encendido.")
    }
}