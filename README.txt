Kurulum:
Java 11 veya üzeri bir JDK.
Intellij IDEA Community Edition Version : 2020.3.4 ya da üzeri bir versiyon

Projeyi çalıştırmadan önce gerekli bağımlılıkların yüklenmesi gerekmektedir. Bağımlılıklar:
org.json 20240303-->API yanıtlarını parse etmek ya da JSON formatında veri oluşturmak için kullanıldı.
junit 4.13.2-->Test anotasyonları ile testleri başlatmak için kullanıldı.
io.rest-assured 5.3.0--> Restful Api'ların testi ve gönderilen istekler  dönen yanıtların doğruluğunun sağlanması için kullanıldı.
TestNG 7.10.2--> Testleri organize etmek ayrıyeten Junit de mevcut olmayan bazı anotasyonlar(BeforSuite vb.) için kullanıldı.
--Not:Pom.xml dosyası üzerinden gerekli bağımlılıkların kurulduğundan emin olunmalıdır.

Testlerin Çalıştırılması:
Card ve board işlemleri için ayrı paketler ve atılan HTTP isteği tipine göre ayrı klaslar oluşturuldu.
TrelloBoardTransactionsApiTest , TrelloBoardTransactionsApiTest paketlerinin altında HTTP metod tiplerine göre ayrılan klaslar mevcuttur. Klaslar içerisinde bulunan test anotasyonundan testler çalıştırılabilir.
