// Generated code from Butter Knife. Do not modify!
package cf.castellon.turistorre.fragments.Principal;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import cf.castellon.turistorre.R;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.common.SignInButton;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Login_ViewBinding implements Unbinder {
  private Login target;

  private View view2131689692;

  private View view2131689694;

  private View view2131689687;

  private View view2131689691;

  @UiThread
  public Login_ViewBinding(final Login target, View source) {
    this.target = target;

    View view;
    target.ivAvatar = Utils.findRequiredViewAsType(source, R.id.ivAvatar, "field 'ivAvatar'", ImageView.class);
    target.email = Utils.findRequiredViewAsType(source, R.id.etEmail, "field 'email'", EditText.class);
    target.password = Utils.findRequiredViewAsType(source, R.id.etPassword, "field 'password'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btDesconectar, "field 'btnNativoDesc' and method 'onClick'");
    target.btnNativoDesc = Utils.castView(view, R.id.btDesconectar, "field 'btnNativoDesc'", Button.class);
    view2131689692 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.layoutLoginNativo = Utils.findRequiredViewAsType(source, R.id.ll_login_nativo, "field 'layoutLoginNativo'", LinearLayout.class);
    target.layoutRegistroNativo = Utils.findRequiredViewAsType(source, R.id.ll_registro_nativo, "field 'layoutRegistroNativo'", LinearLayout.class);
    target.btnFacebook = Utils.findRequiredViewAsType(source, R.id.sign_conectar_f, "field 'btnFacebook'", LoginButton.class);
    view = Utils.findRequiredView(source, R.id.btn_desconectar_g, "field 'signoutG' and method 'onClick'");
    target.signoutG = Utils.castView(view, R.id.btn_desconectar_g, "field 'signoutG'", Button.class);
    view2131689694 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mGoogleLoginButton = Utils.findRequiredViewAsType(source, R.id.sign_conectar_g, "field 'mGoogleLoginButton'", SignInButton.class);
    view = Utils.findRequiredView(source, R.id.btnCrearCuenta, "method 'onClick'");
    view2131689687 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btRegistrar, "method 'onClick'");
    view2131689691 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    Login target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivAvatar = null;
    target.email = null;
    target.password = null;
    target.btnNativoDesc = null;
    target.layoutLoginNativo = null;
    target.layoutRegistroNativo = null;
    target.btnFacebook = null;
    target.signoutG = null;
    target.mGoogleLoginButton = null;

    view2131689692.setOnClickListener(null);
    view2131689692 = null;
    view2131689694.setOnClickListener(null);
    view2131689694 = null;
    view2131689687.setOnClickListener(null);
    view2131689687 = null;
    view2131689691.setOnClickListener(null);
    view2131689691 = null;
  }
}
