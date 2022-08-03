package Test;

import java.io.IOException;


import org.testng.annotations.Test;

import Generics.BaseTest;
import Pomclasses.CreateArchivedwork;

public class Archivework extends BaseTest {

	@Test
public void Archive() throws IOException, InterruptedException
{
 CreateArchivedwork archi=new CreateArchivedwork(driver);
   archi.Archivework();
}
}
