package Suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Tests.TestAutenticacaoUsuario;
import Tests.TestMenus;

@RunWith(Suite.class)
@SuiteClasses({

		TestAutenticacaoUsuario.class,
		TestMenus.class

})

public class SmokeTest {
	
}
