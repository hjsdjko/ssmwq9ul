<template>
	<view class="content">
		<form class="app-update-pv">
			
									<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(240, 239, 239, 1)","margin":"0","borderWidth":"0 0 2rpx 0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">教师工号</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","borderColor":"rgba(215, 215, 215, 1)","borderRadius":"0px","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.jiaoshigonghao" v-model="ruleForm.jiaoshigonghao" placeholder="教师工号"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(240, 239, 239, 1)","margin":"0","borderWidth":"0 0 2rpx 0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">教师姓名</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","borderColor":"rgba(215, 215, 215, 1)","borderRadius":"0px","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.jiaoshixingming" v-model="ruleForm.jiaoshixingming" placeholder="教师姓名"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(240, 239, 239, 1)","margin":"0","borderWidth":"0 0 2rpx 0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">请假单号</view>
				<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","borderColor":"rgba(215, 215, 215, 1)","borderRadius":"0px","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="right-input">
					{{ruleForm.qingjiadanhao}}
				</view>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(240, 239, 239, 1)","margin":"0","borderWidth":"0 0 2rpx 0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">请假开始时间</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","borderColor":"rgba(215, 215, 215, 1)","borderRadius":"0px","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.qingjiakaishishijian" placeholder="请假开始时间" @tap="toggleTab('qingjiakaishishijian')"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(240, 239, 239, 1)","margin":"0","borderWidth":"0 0 2rpx 0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">请假结束时间</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","borderColor":"rgba(215, 215, 215, 1)","borderRadius":"0px","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.qingjiajieshushijian" placeholder="请假结束时间" @tap="toggleTab('qingjiajieshushijian')"></input>
			</view>
																					<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#ccc","margin":"0","borderWidth":"0 0 2rpx 0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group" @tap="xiangguanpingzhengTap" :class='left == "left"?"":"active"'>
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">相关凭证</view>
				<view class="right-input" :style='{textAlign:"left"}' style="padding:0">
					<image :style='{"width":"88rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"88rpx"}' class="avator" v-if="ruleForm.xiangguanpingzheng" :src="ruleForm.xiangguanpingzheng" mode="aspectFill"></image>
					<image :style='{"width":"88rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"88rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
																																				
			<!-- 否 -->
 
			
			          				          				          				          				          				          				<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(204, 204, 204, 1)","margin":"0","borderWidth":"0 0 2rpx 0","borderStyle":"solid","height":"308rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">请假理由</view>
				<textarea :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(215, 215, 215, 1)","borderRadius":"0px","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"280rpx"}' v-model="ruleForm.qingjialiyou" placeholder="请假理由"></textarea>
			</view>
						          				          				          				          							
			          				          				          				          				          				          				          				          				          				          							
			<view class="btn">
				<button :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"rgba(147, 193, 7, 1)","borderColor":"rgba(147, 193, 7, 1)","borderRadius":"8rpx","color":"#fff","borderWidth":"1","width":"80%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

																		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="qingjiakaishishijianConfirm" ref="qingjiakaishishijian" themeColor="#333333"></w-picker>
								<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="qingjiajieshushijianConfirm" ref="qingjiajieshushijian" themeColor="#333333"></w-picker>
																											
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				ruleForm: {
												jiaoshigonghao: '',
																jiaoshixingming: '',
																qingjiadanhao: this.getUUID(),
																qingjiakaishishijian: '',
																qingjiajieshushijian: '',
																qingjialiyou: '',
																xiangguanpingzheng: '',
																sfsh: '',
																shhf: '',
																userid: '',
												},
																																																																																								// 登陆用户信息
				user: {},
                                ro:{
                                   jiaoshigonghao : false,
                                   jiaoshixingming : false,
                                   qingjiadanhao : false,
                                   qingjiakaishishijian : false,
                                   qingjiajieshushijian : false,
                                   qingjialiyou : false,
                                   xiangguanpingzheng : false,
                                   sfsh : false,
                                   shhf : false,
                                   userid : false,
                                },
			}
		},
		components: {
			wPicker
		},
		computed: {
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
					},
		async onLoad(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
						// ss读取
									this.ruleForm.jiaoshigonghao = this.user.jiaoshigonghao
												this.ruleForm.jiaoshixingming = this.user.jiaoshixingming
																																																									
																																																																					
			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`qingjiaxinxi`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='jiaoshigonghao'){
					this.ruleForm.jiaoshigonghao = obj[o];
					this.ro.jiaoshigonghao = true;
					continue;
					}
					if(o=='jiaoshixingming'){
					this.ruleForm.jiaoshixingming = obj[o];
					this.ro.jiaoshixingming = true;
					continue;
					}
					if(o=='qingjiadanhao'){
					this.ruleForm.qingjiadanhao = obj[o];
					this.ro.qingjiadanhao = true;
					continue;
					}
					if(o=='qingjiakaishishijian'){
					this.ruleForm.qingjiakaishishijian = obj[o];
					this.ro.qingjiakaishishijian = true;
					continue;
					}
					if(o=='qingjiajieshushijian'){
					this.ruleForm.qingjiajieshushijian = obj[o];
					this.ro.qingjiajieshushijian = true;
					continue;
					}
					if(o=='qingjialiyou'){
					this.ruleForm.qingjialiyou = obj[o];
					this.ro.qingjialiyou = true;
					continue;
					}
					if(o=='xiangguanpingzheng'){
					this.ruleForm.xiangguanpingzheng = obj[o];
					this.ro.xiangguanpingzheng = true;
					continue;
					}
					if(o=='userid'){
					this.ruleForm.userid = obj[o];
					this.ro.userid = true;
					continue;
					}
				}
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},
																																																																		
			// 多级联动参数
																																																																		
																																																															
																											// 日长控件选择日期时间
			qingjiakaishishijianConfirm(val) {
				console.log(val)
				this.ruleForm.qingjiakaishishijian = val.result;
				this.$forceUpdate();
			},
												// 日长控件选择日期时间
			qingjiajieshushijianConfirm(val) {
				console.log(val)
				this.ruleForm.qingjiajieshushijian = val.result;
				this.$forceUpdate();
			},
																																				
																																																															
																																																															xiangguanpingzhengTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.xiangguanpingzheng = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},
																																				
			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				if((!this.ruleForm.userid)){
					this.$utils.msg(`用户id不能为空`);
					return
				}
																																				if(this.ruleForm.id){
					await this.$api.update(`qingjiaxinxi`, this.ruleForm);
				}else{
					await this.$api.add(`qingjiaxinxi`, this.ruleForm);
				}
				this.$utils.msgBack('提交成功');
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}
	
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 88rpx;
	}
	
	.select .uni-input {
		line-height: 88rpx;
	}
	
	.input .right-input {
		line-height: 88rpx;
	}
</style>
