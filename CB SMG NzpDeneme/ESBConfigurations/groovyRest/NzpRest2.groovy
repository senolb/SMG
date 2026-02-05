import java.net.URLEncoder;

request = new ESBRestRequestURL(xmlInput, action);

request.generateRequest();

String urlToken=@[[NzpEndpoint123]];

output = urlToken;

private String generateEncodedURL(String urlToken)
{
	try
	{
		System.out.println(URLEncoder.encode(urlToken, "UTF-8"));
	    return URLEncoder.encode(urlToken, "UTF-8");
	   
	} catch (Exception e) 
	{
	   e.printStackTrace();
	}
	return "";

}

