<jsp:include page="/WEB-INF/jsp/commonHeader.jsp"></jsp:include>

<div class="container-login" >
<div class="tab-content tabs-login col-lg-12 col-md-12 col-sm-12 cols-xs-12" style="height: 323px;">
				<div class="tab-pane fade active in" id="login-access">
					<h2><i class="glyphicon glyphicon-log-in"></i> Acceso</h2>						
					<form class="form-horizontal" role="form" autocomplete="off" accept-charset="utf-8" method="post">
						<div class="form-group ">
							<label class="sr-only" for="login">Email</label>
								<input type="text" value="" tabindex="1" placeholder="Usuario" id="login_value" name="login" class="form-control">
						</div>
						<div class="form-group ">
							<label class="sr-only" for="password">Password</label>
								<input type="password" tabindex="2" value="" placeholder="Contraseña" id="password" name="password" class="form-control">
						</div>
						
						
						<div class="form-group ">				
								<button class="btn btn-lg btn-primary" tabindex="5" id="submit" name="log-me-in" type="submit">Ingresar</button>
						</div>
					</form>			
				</div>
			</div>
			
</div>			


<jsp:include page="/WEB-INF/jsp/commonFooter.jsp"></jsp:include>