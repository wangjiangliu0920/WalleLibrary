package mo.wall.org.autodensity

import android.content.Context
import android.content.res.Resources
import android.graphics.BitmapFactory
import android.os.Bundle
import android.os.Message
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import mo.wall.org.R
import mo.wall.org.WalleApp
import mo.wall.org.base.BaseAppCompatActivity
import org.wall.mo.ui.autolayout.AutoDensity
import android.support.v4.view.LayoutInflaterCompat.setFactory
import android.view.LayoutInflater


/**
 * 作者 create by moziqi on 2018/7/6
 * 邮箱 709847739@qq.com
 * 说明
 **/
class AutoDensityActivity : BaseAppCompatActivity() {


    override fun handleMessageAct(msg: Message?) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //具体的UI设计图，在img目录可以看到
//        BitmapFactory.decodeResourceStream()
//            ImageView
//        BitmapFactory.decodeResource()
        //图片的修改，没办法了，也只能这样了，暂时放弃研究
        AutoDensity.setCustomDensity(this, WalleApp.ctx!!)
        setContentView(R.layout.activity_auto_density)
        AutoDensity.resetDensity(this)
    }

}