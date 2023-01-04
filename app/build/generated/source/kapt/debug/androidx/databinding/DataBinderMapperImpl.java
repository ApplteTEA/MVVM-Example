package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.appletea.mvvm_example.DataBinderMapperImpl());
  }
}
