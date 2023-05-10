import { initializeApp } from "firebase/app";
import { getFirestore } from "firebase/firestore";

const serviceAccount = require("");

initializeApp({
  credential: cert(serviceAccount)
});

const db = getFirestore();

const data = {
  name: 'name',
  state: 'state',
  country: 'country'
};

const res = db.collection('').doc('LA').set(data);
