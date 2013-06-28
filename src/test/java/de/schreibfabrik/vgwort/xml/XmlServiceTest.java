package de.schreibfabrik.vgwort.xml;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import de.schreibfabrik.vgwort.IntegrationTest;

@RunWith(SpringJUnit4ClassRunner.class)
public class XmlServiceTest extends IntegrationTest
{
	@Autowired
	private XmlService xmlService;
}
