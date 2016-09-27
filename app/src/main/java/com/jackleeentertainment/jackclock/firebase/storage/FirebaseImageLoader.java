//package com.jackleeentertainment.jackclock.firebase.storage;
//
//import com.bumptech.glide.Priority;
//import com.bumptech.glide.load.data.DataFetcher;
//import com.bumptech.glide.load.model.stream.StreamModelLoader;
//import com.google.android.gms.tasks.Tasks;
//import com.google.firebase.storage.StorageReference;
//
//import java.io.InputStream;
//
///**
// * Created by Jacklee on 2016. 9. 25..
// */
//
//
//    /**
//     * ModelLoader implementation to download images from FirebaseStorage with Glide.
//     *
//     * Sample Usage:
//     * <pre>
//     *     StorageReference ref = FirebaseStorage.getInstance().getReference().child("myimage");
//     *     ImageView iv = (ImageView) findViewById(R.id.my_image_view);
//     *
//     *     Glide.with(this)
//     *         .using(new FirebaseImageLoader())
//     *         .load(ref)
//     *         .into(iv);
//     * </pre>
//     */
//    public class FirebaseImageLoader implements StreamModelLoader<StorageReference> {
//
//        @Override
//        public DataFetcher<InputStream> getResourceFetcher(StorageReference model, int width, int height) {
//            return new FirebaseStorageFetcher(model);
//        }
//
//        private class FirebaseStorageFetcher implements DataFetcher<InputStream> {
//
//            private StorageReference mRef;
//
//            FirebaseStorageFetcher(StorageReference ref) {
//                mRef = ref;
//            }
//
//            @Override
//            public InputStream loadData(Priority priority) throws Exception {
//                return Tasks.await(mRef.getStream()).getStream();
//            }
//
//            @Override
//            public void cleanup() {
//                // No cleanup possible, Task does not expose cancellation
//            }
//
//            @Override
//            public String getId() {
//                return mRef.getPath();
//            }
//
//            @Override
//            public void cancel() {
//                // No cancellation possible, Task does not expose cancellation
//            }
//        }
//    }
//
//
