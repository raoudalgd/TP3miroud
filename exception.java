//SacTropRempli

package sac;

@SuppressWarnings("serial")
public class ExceptionSacTropRempli extends Exception 
{
	public ExceptionSacTropRempli(double poids, double poids_max) 
	{
		super("Le poids maximal du sac (" + poids_max + ") est incoherent avec le poids du sac (" + poids + ").");
	}

}
