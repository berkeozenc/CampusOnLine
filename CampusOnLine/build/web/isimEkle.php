<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
    <title>MarkaName-İsim Ekle</title>
        <!-- Latest compiled and minified CSS -->
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Latest compiled and minified JavaScript -->
 <script src="js/jquery-1.10.2.min.js"></script>
 <script src="js/bootstrap.min.js"></script>
<link href="css/bootstrap.min.css" rel="stylesheet">
    <style>
        .navbar {
    position: fixed !important;
    top: 0px;
    width:100%;
    
}
        html,body{
    height: 100%
}
#footer {
    position:absolute; bottom: 0px; left:0px; width: 100%;
    height:100px;
    background-color: #aa1420;
      }
    </style>
   

    <title>İsim Ekle</title>
    
     <?php
    session_start();
    if(isset($_SESSION['user'])){
        
    }
    else{
         header("Location: login_error.php");

         exit(); 
    }
    
    ?>
    
    <script>
        function kontrol(){
         if(document.getElementById("isim").value.length===0){
    alert("Lütfen bir isim giriniz!");
     return false;
    }else{
        return false;
    }
    }
    }
   
   
       
    
    </script>
    
   <link rel="stylesheet" href="css/bootstrap-multiselect.css" type="text/css">
        <script type="text/javascript" src="js/bootstrap-multiselect.js"></script>
  
</head>
<body style="padding-bottom: 200px">
     <div class="site-wrapper">

      <div class="site-wrapper-inner">

        <div class="cover-container">

          <div class="masthead clearfix">
            <div class="inner">
            
             <nav role="navigation" class="navbar navbar-default">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
           
        </div>
        <!-- Collection of nav links and other content for toggling -->
        <div id="navbarCollapse" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="isimler.php"><span class="glyphicon glyphicon-th-list" aria-hidden="true"></span> İsimler</a></li>
                <li class="active"><a href="isimEkle.php"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Yeni İsim Ekle</a></li>
                <li><a href="urunGruplari.php"><span class="glyphicon glyphicon-align-left" aria-hidden="true"></span> Ürün Grupları</a></li>
                <li><a href="sirketler.php"><span class="glyphicon glyphicon-briefcase" aria-hidden="true"></span> Şirketler</a></li>
                <li><a href="tescil.php"><span class="glyphicon glyphicon-check" aria-hidden="true"></span> Tescil</a></li>
                <li><a href="anahtar_sozcukler.php"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> Anahtar Sözcükler</a></li>
                <li><a href="yazarlar.php"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> Yazarlar</a></li>
                <li><a href="alanAdlari.php"><span class="glyphicon glyphicon-globe" aria-hidden="true"></span> Alan Adları</a></li>
                <li><a href="signup.php"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Kullanıcı Ekle</a></li>
                <li><a href="logout.php"><span class="glyphicon glyphicon-off" aria-hidden="true"></span> Çıkış Yap</a></li>
            </ul>
           
        </div>
    </nav>
            </div>
          </div>
<br/><br/><br/>
          <div class="inner cover">
            <h3 class="cover-heading" align="center">Yeni İsim Ekle</h3>
            <table class="table table-striped table-bordered table-condensed table-hover">
            <form action="isimSonuc.php" method="POST" onsubmit="return validate()">
                <tr>
                    <td align="right">İsim:<zorunlu style="color:red; font-size: large">*</zorunlu></h3></td> 
            <td><input type="text" id="isim"  name="isim"/></td> </tr>
                    <tr>
                        <td align="right">Açıklama:</td><td><input type="text" name="desc"/></td> </tr>
                        <tr>   <td align="right" >      
                                Ürün Grubu:</td><td><select name="urungrubu" style="color: #000000">

	<option selected>Hızlı Tüketim(FMCG)</option>

	<option>Dayanıklı Tüketim(Beyaz eşya/mobilya vb.)</option>

	<option>İnşaat</option>

	<option>Tekstil</option>

	<option>Eğlence</option>
        
        <option>Medya ve Yayıncılık</option>
        
        <option>Sağlık ve Sosyal Hizmetler</option>
        
        <option>Finans</option>
        
        <option>İletişim</option>
        
        <option>Diğer</option>

                </select></td></tr>
                        <tr> <td align="right">Anahtar Sözcükler:</td>
                            <td>
                             <input type="text" name="anahtarsoz"/>
                            </td>
                        </tr>
                        <tr>   <td align="right">      
                                TPE Kategori:<zorunlu style="color:red; font-size: large">*</zorunlu></td>
                            <td>
                                  <script type="text/javascript">
    $(document).ready(function() {
        $('#tpe').multiselect({
            maxHeight: 200
        });
    });
</script>
                                <select name="tpe[]" id="tpe" multiple="multiple" size="10" style="color: #000000">

	
        
        <option>1</option>
        <option>2</option>
        <option>3</option>
        <option>4</option>
        <option>5</option>
        <option>6</option>
        <option>7</option>
        <option>8</option>
        <option>9</option>
        <option>10</option>
        <option>11</option>
        <option>12</option>
        <option>13</option>
        <option>14</option>
        <option>15</option>
        <option>16</option>
        <option>17</option>
        <option>18</option>
        <option>19</option>
        <option>20</option>
        <option>21</option>
        <option>22</option>
        <option>23</option>
        <option>24</option>
        <option>25</option>
        <option>26</option>
        <option>27</option>
        <option>28</option>
        <option>29</option>
        <option>30</option>
        <option>31</option>
        <option>32</option>
        <option>33</option>
        <option>34</option>
        <option>35</option>
        <option>36</option>
        <option>37</option>
        <option>38</option>
        <option>39</option>
        <option>40</option>
        <option>41</option>
        <option>42</option>
        <option>43</option>
        <option>44</option>
        <option>45</option>
        <option>bilinmiyor</option>
       

                         
                                </select>
                            </td></tr>
                   
                         <tr>   <td align="right">      
                                Tescil Durumu:</td><td><select name="tesDurum" style="color: #000000">

	<option selected>bilinmiyor</option>

	<option>uygun</option>

	<option>uygun değil</option>

	

                </select></td></tr>
                         
                         
                         
                        <tr>
                            <td align="right"> Şirket:<zorunlu style="color:red; font-size: large">*</zorunlu></td><td><input type="text" id="sirket" name="sirket"/></td></tr>
                            <tr>
                                <td align="right">Proje:<zorunlu style="color:red; font-size: large">*</zorunlu></td><td><input type="text" id="proje" name="proje"/></td></tr>
                                <tr>
                                    <td align="right">Yazar:<zorunlu style="color:red; font-size: large">*</zorunlu></td><td><input type="text" id="yazar" name="yazar"/></td></tr>
                                    
                                    <tr><td colspan="2" align="center"><b>Alan Adları</b></td></tr>
                         
                          <tr>   <td align="right">      
                                .com:</td><td><select name="com" style="color: #000000">

	<option selected>bilinmiyor</option>

	<option>boş</option>
        
        <option>satılık</option>

	<option>dolu</option>
        
        

	

                </select></td></tr>
                          
                          <tr>   <td align="right">      
                                .com.tr:</td><td><select name="comtr" style="color: #000000">

	<option selected>bilinmiyor</option>

	<option>boş</option>
        
        <option>satılık</option>

	<option>dolu</option>

	

                </select></td></tr>
                          
                          <tr>   <td align="right">      
                                .net:</td><td><select name="net" style="color: #000000">

	<option selected>bilinmiyor</option>

	<option>boş</option>
        
        <option>satılık</option>

	<option>dolu</option>

	

                </select></td></tr>
                                    
                                    <tr><td></td>
                                    <td><input type="submit" value="Kaydet" class="btn btn-primary" data-loading-text="Yükleniyor..."  /> 
                                    <input type="reset" value="Vazgeç" class="btn btn-warning" /></td>
                                    </tr>
                                    
        
            </form>       
                
                <script type="text/javascript">
   function validate(){
       var isim = document.getElementById('isim').value;
        var tpe = document.getElementById('tpe').value;
       var sirket=document.getElementById('sirket').value;
       var proje=document.getElementById('proje').value;
       var yazar=document.getElementById('yazar').value;
       

        if(isim != '' && tpe!='' && sirket!='' && proje!='' && yazar!=''){
           return true;
         } else{
            
            alert('Eksik bilgi girdiniz lütfen tüm zorunlu alanları doldurun!');
            return false;
         }
    }
</script>
              

    </table>
            
              
            
           
          </div>

         

          
</body>
</html>
