import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UrlShortenerTest
{
	@Test
	public void test()
	{
		for ( int i = 1; i < Integer.MAX_VALUE; i++ )
		{
			assertEquals( i, UrlShortener.decode( UrlShortener.encode( i ) ) );
		}
	}
}