package md5a250b5ae8e0d44f470cbbba625f678d0;


public class Activity4
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("InTheKnowNews.Activity4, InTheKnowNews, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", Activity4.class, __md_methods);
	}


	public Activity4 () throws java.lang.Throwable
	{
		super ();
		if (getClass () == Activity4.class)
			mono.android.TypeManager.Activate ("InTheKnowNews.Activity4, InTheKnowNews, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
