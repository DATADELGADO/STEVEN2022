package sql_bd_montoproducto;




public class Factura {
// ENTRADA

    private int idFactura;
    private int cantidadCajas;
    private int unidadesxCaja;
    private double precioxUnidad;

//SALIDA
    private double importeIvaTotal;

    public Factura() {
    }

    public Factura(int idFactura, int cantidadCajas, int unidadesxCaja, double precioxUnidad) {
        this.idFactura = idFactura;
        this.cantidadCajas = cantidadCajas;
        this.unidadesxCaja = unidadesxCaja;
        this.precioxUnidad = precioxUnidad;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getCantidadCajas() {
        return cantidadCajas;
    }

    public void setCantidadCajas(int cantidadCajas) {
        this.cantidadCajas = cantidadCajas;
    }

    public int getUnidadesxCaja() {
        return unidadesxCaja;
    }

    public void setUnidadesxCaja(int unidadesxCaja) {
        this.unidadesxCaja = unidadesxCaja;
    }

    public double getPrecioxUnidad() {
        return precioxUnidad;
    }

    public void setPrecioxUnidad(double precioxUnidad) {
        this.precioxUnidad = precioxUnidad;
    }

    public double[] getImporteIvaTotal() {
        double[] importeIvaTotal = new double[3];
        double importe = this.cantidadCajas * this.precioxUnidad * this.unidadesxCaja;
        double iva = importe * 0.21;
        double total = importe + iva;

        importeIvaTotal[0] = importe;
        importeIvaTotal[1] = iva;
        importeIvaTotal[2] = total;

        return importeIvaTotal;
    }

    public static void cabecera() {
        System.out.printf("%10s  %7s  %9s  %14s  %7s  %7s  %7s\n", "IDFACTURA", "N#CAJAS", "UNIDADES", "PRECIO/UNIDAD", "IMPORTE", "IVA", "TOTAL");
    }

    public void cuerpo() {
        System.out.printf("%10d  %7d  %9d  %14.2f  %7.2f  %7.2f  %7.2f\n", idFactura, cantidadCajas, unidadesxCaja, precioxUnidad, getImporteIvaTotal()[0], getImporteIvaTotal()[1], getImporteIvaTotal()[2]);

    }
}
