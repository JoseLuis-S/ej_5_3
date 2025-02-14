class Lavadora(val nombre: String = "Desconocido"): DispositivoElectronico, EncendidoApagado {
    var encendido = false

    override fun reiniciar() {
        println("Lavadora reiniciada.")
    }

    override fun encender() {
        encendido = true
        println("Lavadora encendida.")
    }

    override fun apagar() {
        encendido = false
        println("Lavadora apagada.")
    }
}