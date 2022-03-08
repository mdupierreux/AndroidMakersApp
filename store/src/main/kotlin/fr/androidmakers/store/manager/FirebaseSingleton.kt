package fr.androidmakers.store.manager

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreSettings

object FirebaseSingleton {
    val firestore by lazy {
        FirebaseFirestore.getInstance().apply {
            firestoreSettings = FirebaseFirestoreSettings.Builder()
                    .setPersistenceEnabled(true)
                    .build()
        }
    }
}