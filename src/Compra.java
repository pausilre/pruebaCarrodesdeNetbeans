/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paula
 */
public class Compra {
    private int pantalones;
	private int camisas;
	private int sudaderas;
	
	public void realizarCompra() {
		pantalones++;
		camisas++;
		sudaderas++;
	}
	
	public int getPantalones() {
		return pantalones;
	}
	public int getCamisas() {
		return camisas;
	}
	public int getSudaderas() {
		return sudaderas;
	}
    
}
