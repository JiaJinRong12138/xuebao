//全
var token = document.cookie.valueOf();

window.onload = function() {
				//头部
				var head_li = $(".head_li");
				head_li.hover(function() {
					$(this).addClass("select").siblings().removeClass("select");
				})

				//登录
				//$(window).width()页面的宽度
				var registerId = $("#register");
				var registerClass = $(".register");
				registerId.click(function() {
					registerClass.css('left', ($(window).width() - 171 - 300) / 2);
					registerClass.show(500);
				});
				var deleteClass = $(".delete");
				deleteClass.click(function(e) {
					registerClass.hide(500);
				});

				//个人中心
				var personCenter = $(".personCenter");
				personCenter.click(function() {
					window.location.href = "html/PersonCenter.html";
				})
				//退出登录


				//点击报名
				var qiangpaio = $("#qiangpaio");
				qiangpaio.click(function() {
					//获取学号
					var tfswufe_id = $("#tfswufe_id").val();
					if(tfswufe_id === "") {
						alert("你未登录！请登录！！！");
					}else if(loginFlag == false ){
						alert("你未登录！请登录！！！");
					}else {
						alert(id + "报名成功!");
						qiangpaio.css("background","gray");
						qiangpaio.val("已报名");
					}
				})

			}


function  login() {

	console.log(token);
	if($('#register').text() == "登录") {
        var sno = $('#tfswufe_id').val();
        var spassword = $('#tfswufe_psw').val();
        var json = {
            sno: sno,
            spassword: spassword,
            token: token
        }
        var t = JSON.stringify(json);
        $.ajax('http://127.0.0.1:8080/test/login', {
            data: JSON.stringify(json),
            contentType: "application/json",
            dataType: 'json',//服务器返回json格式数据
            type: 'POST',//HTTP请求类型
            timeout: 10000,//超时时间设置为10秒；
            success: function (data) {
            	console.log(data);
                if (data.code == -1) {
                    alert("账号或密码错误");
                } else if(data.code == 107){
                	alert("你已经登陆过了，请勿重复操作");
				} else if(data.code == 100) {
                    token = data.data.token;
                    console.log(token);
                    document.cookie = "token = " + token;
                    console.log(getCookie("token"))
                    window.location.reload();
                } else{
                	alert("未知错误，请联系管理员");
				}
            },
            error: function (xhr, type, errorThrown) {

            }
        });
    }
    // if()
}


// function setCookie(key, value) {
// 	var exp = new Date();
// 	//设置一小时时间
// 	exp.setTime(exp.getTime() + 60 * 60 * 1000);
// 	document.cookie = key + "=" + escape(value);
// }
