public class TestMiFecha {
    public static void main(String[] args) {

        MiFecha fecha1 = new MiFecha();
        System.out.println("Fecha 1: " + fecha1.getDia() + "/" + fecha1.getMes() + "/" + fecha1.getAnio());

        MiFecha fecha2 = new MiFecha(29, 2, 2024); // Año bisiesto
        System.out.println("Fecha 2: " + fecha2.getDia() + "/" + fecha2.getMes() + "/" + fecha2.getAnio());

        // Probar métodos set con una fecha inválida
        MiFecha fecha3 = new MiFecha();
        System.out.println("Fecha válida inicial: " + fecha3.fechaValida());
        if (!fecha3.setDia(31) || !fecha3.setMes(2) || !fecha3.setAnio(2023)) {
            System.out.println("Fecha no válida asignada: " + fecha3.getDia() + "/" + fecha3.getMes() + "/" + fecha3.getAnio());
        } else {
            System.out.println("Nueva fecha: " + fecha3.getDia() + "/" + fecha3.getMes() + "/" + fecha3.getAnio());
        }
    }
}

