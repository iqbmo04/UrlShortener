import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UrlShortenerTest
{
	@Test
	public void testEncodeAndDecode()
	{
		for ( int i = 1; i < 10000000; i++ )
		{
			assertEquals( i, UrlShortener.decode( UrlShortener.encode( i ) ) );
		}
	}
}