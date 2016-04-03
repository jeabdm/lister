<jsp:include page="/WEB-INF/jsp/commonHeader.jsp"></jsp:include>
<link href="/lister/resources/css/login.css" rel="stylesheet" media="screen">
<script type="text/javascript" src="/lister/resources/js/login.js"> </script>

<div class="mainbox col-md-6 col-md-offset-3 col-sm-6 col-sm-offset-3" id="loginbox"> 
        
        <div class="row">                
            <div class="iconmelon">
             	<img src="resources/images/doc.png" width="190" height="190"></img>
            </div>
        </div>
        
        <div class="panel panel-default">
            
            <div class="panel-heading">
                <div class="panel-title text-center">&nbsp;</div>
            </div>     

            <div class="panel-body">

                <form method="POST"  class="form-horizontal" id="formLogin">
                   
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                        <input type="text" placeholder="Usuario" name="parUser" class="form-control" id="parUser">                                        
                    </div>

                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                        <input type="password" placeholder="Contrase&ntilde;a" name="parPassword" class="form-control" id="parPassword">
                        
                    </div>
                    
                    <div class="input-group">
                                <span><input type="checkbox" id="rememberme" name="remember-me"> Recordarme </span>
                    </div>                                                                  

                    <div class="form-group">
                        <!-- Button -->
                        <div class="col-sm-12 controls">
                            <button class="btn btn-primary pull-right" type="submit"><i class="glyphicon glyphicon-log-in"></i> Entrar</button>                          
                        </div>
                    </div>

                </form>     

           </div>                     
        
       </div>  
</div>			
<jsp:include page="/WEB-INF/jsp/commonFooter.jsp"></jsp:include>