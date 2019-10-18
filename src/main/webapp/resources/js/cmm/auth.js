"use strict"
var auth=auth||{};
auth =((x)=>{
	let _, js,authvue;
	let init =()=>{
		_=$.ctx();
		js=$.js();
		authvue=js+'/vue/auth_vue.js'
		
	}
	let onCreate =()=>{
		init();
		$.getScript(authvue).done(()=>{
			setContentView()
			$('#a_go_join').click(()=>{
				join()
	        });
		})
		
	
	}		
	let login=()=>{
		 let x={css:$.css(),img:$.img()}
		    $('head')
			.html(auth_vue.login_head(x))
			
			$('body')
			.addClass('text-center')
			.html(auth_vue.login_body(x))
			
		       	$('<button>',{ type:"submit",
		       						text:"Sign in",
		       						click: e=>{
		       							e.preventDefault();
		       							let data = { cid :  $('#inputcid').val() ,
		       		                            cpw : $('#inputcpw').val()}
		       							$.ajax({
		       		                        url : _+'/hcust/login',
		       		                        type : 'POST',
		       		                        dataType : 'json',
		       		                        data: JSON.stringify(data) ,
		       		                        contentType : 'application/json',
		       		                        success : d =>{
		       		                            alert('AJAX 성공 ' +d.cid+',' + d.cpw)},
		       		                            error : e =>{
		       			                            alert('AJAX실패' + url)
		       			                        }})
		       							
		       							
		       						}
		           }).addClass("btn btn-lg btn-primary btn-block")
		          .appendTo('#btn_login')
		
	}
	let setContentView=()=>{
		login()
	}
	let join=()=>{
	$('head')
	.html(auth_vue.join_head())
	
	$('body')
	.html(auth_vue.join_body())
		$('<button>',{
        text : 'Continue to checkout' ,
        href: '#' ,
        click : e=>{
        	e.preventDefault();
            let data = { cid :  $('#cid').val() ,
                    cpw : $('#cpw').val()
            }
			    $.ajax({
                    url : _+'/hcust/join',
                    type : 'POST',
                    dataType : 'json',
                    data: JSON.stringify(data) ,
                    contentType : 'application/json',
                    success : d =>{
                        alert('AJAX 성공 ' +d.cid+',' + d.cpw)
                       login()
                    },
                    error : e =>{
                        alert('AJAX실패' + url)
                    }
                })
       
      
            }
        })
        .addClass('btn btn-primary btn-lg btn-block')
        .appendTo('#checkbtn')
	}
	
	return{onCreate ,join ,login}
})();