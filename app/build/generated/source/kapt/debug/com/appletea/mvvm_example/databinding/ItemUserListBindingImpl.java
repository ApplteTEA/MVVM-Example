package com.appletea.mvvm_example.databinding;
import com.appletea.mvvm_example.R;
import com.appletea.mvvm_example.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemUserListBindingImpl extends ItemUserListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.item_user_list_header, 3);
        sViewsWithIds.put(R.id.item_user_list_content, 4);
        sViewsWithIds.put(R.id.item_user_list_avatar, 5);
        sViewsWithIds.put(R.id.item_user_list_like_img, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemUserListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ItemUserListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.itemUserListLogin.setTag(null);
        this.itemUserListSectionHeader.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.user == variableId) {
            setUser((com.appletea.mvvm_example.data.remote.model.UserListModel.SearchData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUser(@Nullable com.appletea.mvvm_example.data.remote.model.UserListModel.SearchData User) {
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.appletea.mvvm_example.data.remote.model.UserListModel.SearchData user = mUser;
        java.lang.String userLogin = null;
        java.lang.String userSectionHeader = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (user != null) {
                    // read user.login
                    userLogin = user.getLogin();
                    // read user.sectionHeader
                    userSectionHeader = user.getSectionHeader();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.itemUserListLogin, userLogin);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.itemUserListSectionHeader, userSectionHeader);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): user
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}