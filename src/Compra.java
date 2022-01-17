/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *La clase compra sirve para realizar una lista de la compra
 * @author paula
 * @version 13.02
 */
public class Compra {
    private int pantalones;
	private int camisas;
	private int sudaderas;
	
        /**
         * El metodo realizarCompra incrementa la compra en 1 producto de cada
         */
	public void realizarCompra() {
		pantalones++;
		camisas++;
		sudaderas++;
	}
	/**
         * El metodo getPantalones te devuelve la cantidad de pantalones
         * @return numero de pantalones
         */
	public int getPantalones() {
		return pantalones;
	}
        /**
         * El metodo getCamisas te devuelve la cantidad de camisas
         * @return numero de camisas
         */
	public int getCamisas() {
		return camisas;
	}
        
        /**
         * El metodo getSudaderas te devuelve la cantidad de sudaderas
         * @return numero de sudaderas
         */
	public int getSudaderas() {
		return sudaderas;
	}
        
        /**
         * El metodo sumaCamisasyPantalones devuelve la suma entre pantalones y camisas
         * @param pantalones numero de pantalones
         * @param camisas numero de camisas
         * @return total de la suma entre pantalones y camisas
         */
        public int sumaCamisasyPantalones(int pantalones, int camisas){
            return pantalones+camisas;
        }
    
}
