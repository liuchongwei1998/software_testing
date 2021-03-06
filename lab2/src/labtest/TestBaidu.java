package labtest;


import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File; 
import java.io.IOException; 
import jxl.Cell; 
import jxl.Sheet; 
import jxl.Workbook; 
import jxl.read.biff.BiffException; 

@RunWith(Parameterized.class)
public class TestBaidu {

  public String input;

  public String expected1;

  public String expected2;

  public String expected3;
  
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  static String[][] tmp=new String[144][4];
  private StringBuffer verificationErrors = new StringBuffer();
 
  public TestBaidu(String i,String e1,String e2,String e3)
  {
	  this.input=i;
	  this.expected1=e1;
	  this.expected2=e2;
	  this.expected3=e3;
  }
  
  @Before
  public void setUp() throws Exception {
	  /*File f=new File(System.getProperty("user.dir") + "/src/namelist.xls"); 
	    Workbook book=Workbook.getWorkbook(f);// 
	    Sheet sheet=book.getSheet(0); //��õ�һ������������ 
	    for(int i=2;i<sheet.getRows();i++){ 
		String c1=sheet.getCell(1, i).getContents();
		String c2=sheet.getCell(2, i).getContents();
		String c3=sheet.getCell(3, i).getContents(); 
		System.out.println("{"+"\""+c1+"\""+","+"\""+c1+"\""+","+"\""+c2+"\""+","+"\""+c3+"\""+"}"+",");
      String[] u=new String[] {c1,c1,c2,c3};
	    tmp[i-2]=u;
	    }*/
	
	   
	
	  String driverPath = System.getProperty("user.dir") + "/src/geckodriver.exe";
	  System.setProperty("webdriver.gecko.driver", driverPath);
	  driver = new FirefoxDriver();
	  baseUrl = "http://121.193.130.195:8800";
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	  driver.get(baseUrl + "/");
  }
 @Parameters
 public static Iterable<Object[]> data() {

     return Arrays.asList(new Object[][]{{"3016218051","3016218051","�˽�","https://github.com/popboykingdjko"},
    		 {"3016218052","3016218052","��С�","https://github.com/xiaoxuaoj"},
    		 {"3016218053","3016218053","����ˮ","https://github.com/nbdfls"},
    		 {"3016218054","3016218054","����Ⱥ","https://github.com/hyqzz1"},
    		 {"3016218055","3016218055","������",""},
    		 {"3016218056","3016218056","���","https://github.com/FBIbaby"},
    		 {"3016218057","3016218057","���","https://github.com/riginAI/test"},
    		 {"3016218058","3016218058","�","https://github.com/likai3016218058"},
    		 {"3016218059","3016218059","���ǿ�","https://github.com/forAragaki/Software-Testing.git"},
    		 {"3016218060","3016218060","������","https://github.com/liuchongwei1998"},
    		 {"3016218061","3016218061","����ɭ","https://github.com/liuyuesen"},
    		 {"3016218062","3016218062","¥��","https://github.com/loulin206"},
    		 {"3016218063","3016218063","������","https://github.com/acan777"},
    		 {"3016218064","3016218064","ʯ���","https://github.com/Winbeeone/Hello-GitHub"},
    		 {"3016218065","3016218065","����","https://github.com/tangsongTJU"},
    		 {"3016218066","3016218066","���Ӻ�","https://github.com/LITTLEEEEE/st.git"},
    		 {"3016218067","3016218067","����","https://github.com/WangChen0902"},
    		 {"3016218068","3016218068","����","https://github.com/skye0207"},
    		 {"3016218069","3016218069","����","https://github.com/wanglei201810/HHH.git"},
    		 {"3016218070","3016218070","�Ľ���",""},
    		 {"3016218072","3016218072","����Ÿ","https://github.com/Panda216"},
    		 {"3016218073","3016218073","������","https://github.com/AQITF/software-testing-course"},
    		 {"3016218075","3016218075","����Զ","https://github.com/Tyrusmacv"},
    		 {"3016218076","3016218076","�Ŵ�","https://github.com/Tyrusmacv"},
    		 {"3016218077","3016218077","�ſ���","https://github.com/DanielKZhang"},
    		 {"3016218078","3016218078","�����","https://gitee.com/zqfgly"},
    		 {"3016230028","3016230028","����ϼ","https://github.com/XiaZiXia"},
    		 {"3016204130","3016204130","����",""},
    		 {"3016218079","3016218079","������",""},
    		 {"3016218080","3016218080","������","https://github.com/cyytju"},
    		 {"3016218081","3016218081","�½�",""},
    		 {"3016218083","3016218083","���B","https://github.com/HaoFuTju"},
    		 {"3016218084","3016218084","����ܲ","https://github.com/Ziyiiii"},
    		 {"3016218085","3016218085","������","https://github.com/guopeiming"},
    		 {"3016218086","3016218086","�����",""},
    		 {"3016218087","3016218087","������","https://github.com/brightknight177"},
    		 {"3016218088","3016218088","��־��","https://github.com/zhijielee"},
    		 {"3016218089","3016218089","������","https://github.com/guguguzi"},
    		 {"3016218090","3016218090","������","https://github.com/EchoLiuYinan"},
    		 {"3016218091","3016218091","¬�","https://github.com/iiTachi/"},
    		 {"3016218092","3016218092","����",""},
    		 {"3016218093","3016218093","ŷ�����","https://github.com/SouperO"},
    		 {"3016218094","3016218094","������","https://github.com/qyhxxx"},
    		 {"3016218096","3016218096","������","https://github.com/SunCubeIsMyID"},
    		 {"3016218097","3016218097","������","https://github.com/passerw"},
    		 {"3016218098","3016218098","����","https://github.com/old-yellow"},
    		 {"3016218099","3016218099","��һ��","https://github.com/yibowang98"},
    		 {"3016218100","3016218100","κ��","https://github.com/Landy0524"},
    		 {"3016218101","3016218101","������","https://github.com/nkaccounting"},
    		 {"3016218102","3016218102","�ų���","https://github.com/PlatinumYi"},
    		 {"3016218103","3016218103","�ſ�","https://github.com/zk990202"},
    		 {"3016218104","3016218104","��ε��","https://github.com/Zwh0508"},
    		 {"3016218105","3016218105","��ӱ��","https://github.com/newyingyi"},
    		 {"3016218106","3016218106","�Լ��","https://github.com/uareagay"},
    		 {"3016218107","3016218107","����","https://github.com/LeilaniZ"},
    		 {"3016204310","3016204310","�����","https://github.com/hshsilver/softwaretest"},
    		 {"3016207516","3016207516","�����",""},
    		 {"3016218108","3016218108","����","https://github.com/Barbra0613"},
    		 {"3016218109","3016218109","��ŵ","https://github.com/Nicole1772"},
    		 {"3016218110","3016218110","��ɭ��","https://github.com/csl784513390"},
    		 {"3016218111","3016218111","���Ӻ�","https://github.com/czhxbz"},
    		 {"3016218112","3016218112","�޸�","https://github.com/whyNotwh"},
    		 {"3016218113","3016218113","������","https://github.com/tjugwt"},
    		 {"3016218114","3016218114","��̹","https://github.com/tjugwt"},
    		 {"3016218115","3016218115","����","https://github.com/BoHuyyy"},
    		 {"3016218116","3016218116","������","https://github.com/mangoSteve"},
    		 {"3016218117","3016218117","�����","https://github.com/mangoSteve"},
    		 {"3016218118","3016218118","����ʢ","https://github.com/AndrewJYS"},
    		 {"3016218119","3016218119","������","https://github.com/liphcpp"},
    		 {"3016218120","3016218120","���Ÿ�","https://github.com/tju-lzg"},
    		 {"3016218121","3016218121","��Ȼ","https://github.com/Nfboys"},
    		 {"3016218122","3016218122","������","https://github.com/tcklll/software-testing.git"},
    		 {"3016218123","3016218123","�����","https://github.com/MHYpony"},
    		 {"3016218124","3016218124","�Ϸ���","https://github.com/FANBoMeng3016218124/swTest.git"},
    		 {"3016218125","3016218125","������","https://github.com/tjwhm"},
    		 {"3016218126","3016218126","������","https://github.com/hnwyx/software-testing"},
    		 {"3016218127","3016218127","������","https://github.com/wwwwangyiting"},
    		 {"3016218128","3016218128","Фҵ��","https://github.com/HNSHongTian/SoftwareTesting"},
    		 {"3016218129","3016218129","���躭","https://github.com/linghanxu-tju/software_testing.git"},
    		 {"3016218130","3016218130","����","https://github.com/YWlancer"},
    		 {"3016218131","3016218131","�ż���","https://github.com/oikawamomo/software_test"},
    		 {"3016218133","3016218133","�Խ�","https://github.com/ZJ921"},
    		 {"3016218134","3016218134","������","https://github.com/zzzyyyrrr"},
    		 {"3016218135","3016218135","����","https://github.com/tjudoubi"},
    		 {"3014218120","3014218120","����","https://github.com/SoSoSorry"},
    		 {"3016218136","3016218136","���κ϶�����ľ��","https://github.com/users/azzr997/projects/1"},
    		 {"3016218137","3016218137","���ַ�","https://github.com/SryTo/SoftwareTesting.git"},
    		 {"3016218138","3016218138","����","https://github.com/STHARUKI"},
    		 {"3016218139","3016218139","���","https://github.com/skadoodleR"},
    		 {"3016218140","3016218140","��𩻪","https://github.com/Potmon/STT2016.git"},
    		 {"3016218141","3016218141","�����","https://github.com/everlastingstars"},
    		 {"3016218142","3016218142","��ɯ���ᡤ����������","https://github.com/Lothric19"},
    		 {"3016218143","3016218143","�����","https://github.com/bxsj/"},
    		 {"3016218144","3016218144","�����","https://github.com/0-Avalon-0"},
    		 {"3016218145","3016218145","������","https://github.com/mssjliwenxu"},
    		 {"3016218146","3016218146","������","https://github.com/MaoMaoChina"},
    		 {"3016218147","3016218147","������","https://github.com/LiuChunY"},
    		 {"3016218148","3016218148","����","https://github.com/liuzhidemaomao"},
    		 {"3016218149","3016218149","¦����","https://github.com/Lou11300306?tab=projects"},
    		 {"3016218150","3016218150","����","https://github.com/Horsepower8888"},
    		 {"3016218151","3016218151","�˷���","https://github.com/Skypfx/softwareTesting"},
    		 {"3016218152","3016218152","ʯ����","https://github.com/colindying"},
    		 {"3016218153","3016218153","ʷ����","https://github.com/htmmd27"},
    		 {"3016218154","3016218154","ʷ��","https://github.com/tjuspAIC/Software-Testing"},
    		 {"3016218155","3016218155","����","https://github.com/Vincent-Sun"},
    		 {"3016218156","3016218156","̷����","https://github.com/980801"},
    		 {"3016218157","3016218157","����","https://github.com/ChenHsing"},
    		 {"3016218158","3016218158","����","https://github.com/yangmeng19980420"},
    		 {"3016218159","3016218159","�Ż���","https://github.com/Ives66"},
    		 {"3016218160","3016218160","�Ż�","https://github.com/zhuang12/SoftwareTest.git"},
    		 {"3016218161","3016218161","������","https://github.com/michellezyw"},
    		 {"3016218162","3016218162","��ݼ��","https://github.com/Cyphexl"},
    		 {"3016218163","3016218163","����ع","https://github.com/lazygirlyu/homework"},
    		 {"3016218164","3016218164","ף����","https://github.com/GZhuJJ/SoftwareTestingCourse"},
    		 {"3016207275","3016207275","���","https://github.com/Lzhaohui"},
    		 {"3016214077","3016214077","������","https://github.com/ZhaoMingYang-tju"},
    		 {"3016218165","3016218165","���ι�������������","https://github.com/azhar241892"},
    		 {"3016218166","3016218166","�����","https://github.com/husuhusuhusu"},
    		 {"3016218167","3016218167","������","https://github.com/DemonTimor"},
    		 {"3016218168","3016218168","����","https://github.com/JoHnHC"},
    		 {"3016218169","3016218169","���","https://github.com/ritian-hh"},
    		 {"3016218170","3016218170","�ƶ�÷","https://github.com/hdm926"},
    		 {"3016218171","3016218171","������","https://github.com/AWenXiong"},
    		 {"3016218172","3016218172","������","https://github.com/SSFDLware/software-testing"},
    		 {"3016218173","3016218173","������","https://github.com/yangyi66"},
    		 {"3016218174","3016218174","���ĺ�","https://gitee.com/tju_hei/software_test.git"},
    		 {"3016218175","3016218175","����","https://github.com/liuyang806"},
    		 {"3016218176","3016218176","Ī����","mcyatom@gmail.com"},
    		 {"3016218177","3016218177","������","https://github.com/ElegantQiu"},
    		 {"3016218178","3016218178","������","https://github.com/sqq7777"},
    		 {"3016218179","3016218179","������","https://github.com/suimingben"},
    		 {"3016218180","3016218180","������","https://github.com/sqis777?tab=repositories"},
    		 {"3016218181","3016218181","���","https://culturepanda.github.io/SoftwareTesting/"},
    		 {"3016218182","3016218182","��־��","https://github.com/YourBrotherTT/softwareTesting.git"},
    		 {"3016218183","3016218183","����","https://github.com/guuuuji/Software-test.git"},
    		 {"3016218184","3016218184","л����","https://github.com/fallentree"},
    		 {"3016218186","3016218186","Ҷ����","https://github.com/MarcusNerva"},
    		 {"3016218187","3016218187","�������������������","https://github.com/ilgarrr"},
    		 {"3016218188","3016218188","������","https://github.com/githaub/homework.git"},
    		 {"3016218189","3016218189","������","https://github.com/llmgpty/tjuscsst.git"},
    		 {"3016218190","3016218190","������","https://github.com/ZhonglinZ"},
    		 {"3016218191","3016218191","ף��Ԫ","https://github.com/ZHUKAIYUAN0/test"},
    		 {"3016218192","3016218192","�����","https://github.com/jianxin-YL"}});
 }
  @Test
  public void testBaidu() throws Exception {
	
	  
   
    //WebElement we = driver.findElement(By.name("id"));
    //we.click();
//    driver.findElement(By.id("kw")).click();
    driver.findElement(By.name("id")).clear();
    driver.findElement(By.name("id")).sendKeys(input);
    
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys(input.substring(4));
    
    driver.findElement(By.id("btn_login")).click();
    assertEquals(driver.findElement(By.id("student-id")).getText(), expected1);
    assertEquals(driver.findElement(By.id("student-name")).getText(), expected2);
    assertEquals(driver.findElement(By.id("student-git")).getText(), expected3);

    driver.close();
   // driver.findElement(By.id("btn_logout")).click();
    //driver.findElement(By.id("btn_return")).click();
    
  }

  @After
  public void tearDown() throws Exception {
//    driver.quit();
//    String verificationErrorString = verificationErrors.toString();
//    if (!"".equals(verificationErrorString)) {
//      fail(verificationErrorString);
//    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

