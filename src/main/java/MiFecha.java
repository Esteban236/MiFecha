public class MiFecha {
    //Atributos
    private int dia;
    private int mes;
    private int anio;

    // Metodos Getters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    // Setters
    public boolean setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
            return true;
        }
        return false;
    }

    public boolean setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
            return true;
        }
        return false;
    }

    public boolean setAnio(int anio) {
        if (anio >= 1) { // Año debe ser positivo
            this.anio = anio;
            return true;
        }
        return false;
    }

    // Validar si la fecha es válida
    public boolean fechaValida() {
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            return false;
        }
        // Validar  año bisiestos
        if (mes == 2) {
            if (esBisiesto()) {
                return dia <= 29;
            } else {
                return dia <= 28;
            }
        }

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return dia <= 30;
        }
        return true;
    }

    // Verificar si el año es bisiesto
    private boolean esBisiesto() {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    // Constructor por defecto
    public MiFecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1990;
    }

    // Constructor con parámetros
    public MiFecha(int dia, int mes, int anio) {
        if (setDia(dia) && setMes(mes) && setAnio(anio) && fechaValida()) {
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.anio = 1990;
        }
    }
}
