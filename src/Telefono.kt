class Telefono(val nombre: String = "Desconocido"): EncendidoApagado, DispositivoElectronico {
    var encendido = false

    override fun encender() {
        encendido  = true
        println("Telefono encendido.")
    }

    override fun apagar() {
        encendido = false
        println("Telefono apagado.")
    }

    override fun reiniciar() {
        println("Telefono reiniciado.")
    }
}