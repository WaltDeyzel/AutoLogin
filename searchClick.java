// import com.gargoylesoftware.htmlunit.*;
// import com.gargoylesoftware.htmlunit.html.*;
// // DOWNLOAD https://sourceforge.net/projects/htmlunit/files/latest/download

// public class searchClick {
//     public static void main(String[] args) throws Exception {
//         WebClient webClient = new WebClient();
//         HtmlPage page = webClient.getPage("http://www.google.com");

//         HtmlInput searchBox = page.getElementByName("q");
//         searchBox.setValueAttribute("htmlunit");

//         HtmlSubmitInput googleSearchSubmitButton = page.getElementByName("btnG"); // sometimes it's "btnK"
//         page = googleSearchSubmitButton.click();

//         HtmlDivision resultStatsDiv = page.getFirstByXPath("//div[@id='resultStats']");

//         System.out.println(resultStatsDiv.asText()); // About 309,000 results
//         webClient.closeAllWindows();
//     }
// }