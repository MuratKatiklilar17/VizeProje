package vizeOdev;

import org.junit.Test;
import junit.framework.Assert;

import static junit.framework.Assert.*;
import tr.edu.medipol.yazilimaraclarý.MuratKatiklilar.MuhasebeProgrami;

public class MuhasebePprogramiTest {

	@Test
	public void UcretHesaplaTest() {
		 int calisilansaat = 100;
		 int saatlikucret = 45;
		int UcretHesapla = MuhasebeProgrami.UcretHesapla(calisilansaat, saatlikucret);		 
		 Assert.assertEquals(4500,  UcretHesapla);
		 
	}
	
}
