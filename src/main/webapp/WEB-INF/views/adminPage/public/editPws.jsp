<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://zlzkj.com/tags" prefix="z"%>
<script src="${__static__}/admin/js/public.js" type="text/javascript"></script>

<!-- 重置口令 -->
<form id="form" action="${__url__}" method="post">
    <table align="center" class="form-table ml30">
		 <tr>
		    <td>重置密码：</td>
			<td>
			  <input name="password" id="password" type="text" class="jq-validatebox" data-options="required:true,validType:'safepass'"/>
			</td>
		</tr>
		<tr>
			<td>确认密码：</td>
			<td>
			  <input name="rpassword" id="rpassword" type="text" class="jq-validatebox" data-options="required:true" validType="equalto['#password']"/>
			</td>
		 </tr>   
		 <tr>
		    <td>&nbsp;</td>
			<td>
				<button type="submit" class="btn btn-small btn-success">确定</button>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			    <a class="btn btn-small btn-success closeDl">返回</a>
			</td>
		</tr>   
	</table>
</form>
