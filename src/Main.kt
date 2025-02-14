fun main() {
    val telefono = Telefono()
    val coche = Coche()
    val lavadora = Lavadora()

    telefono.apagar()
    telefono.reiniciar()

    coche.encender()
    coche.acelerar(100)
    coche.frenar(40)
    coche.apagar()
    coche.acelerar(10)

    lavadora.reiniciar()
}