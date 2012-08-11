/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

public class btPairCachingGhostObject extends btGhostObject {
	private long swigCPtr;

	protected btPairCachingGhostObject (long cPtr, boolean cMemoryOwn) {
		super(gdxBulletJNI.btPairCachingGhostObject_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}

	public static long getCPtr (btPairCachingGhostObject obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize () {
		delete();
	}

	public synchronized void delete () {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btPairCachingGhostObject(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

	public btPairCachingGhostObject () {
		this(gdxBulletJNI.new_btPairCachingGhostObject(), true);
	}

	public void addOverlappingObjectInternal (btBroadphaseProxy otherProxy, btBroadphaseProxy thisProxy) {
		gdxBulletJNI.btPairCachingGhostObject_addOverlappingObjectInternal__SWIG_0(swigCPtr, this,
			btBroadphaseProxy.getCPtr(otherProxy), otherProxy, btBroadphaseProxy.getCPtr(thisProxy), thisProxy);
	}

	public void addOverlappingObjectInternal (btBroadphaseProxy otherProxy) {
		gdxBulletJNI.btPairCachingGhostObject_addOverlappingObjectInternal__SWIG_1(swigCPtr, this,
			btBroadphaseProxy.getCPtr(otherProxy), otherProxy);
	}

	public void removeOverlappingObjectInternal (btBroadphaseProxy otherProxy, btDispatcher dispatcher, btBroadphaseProxy thisProxy) {
		gdxBulletJNI.btPairCachingGhostObject_removeOverlappingObjectInternal__SWIG_0(swigCPtr, this,
			btBroadphaseProxy.getCPtr(otherProxy), otherProxy, btDispatcher.getCPtr(dispatcher), dispatcher,
			btBroadphaseProxy.getCPtr(thisProxy), thisProxy);
	}

	public void removeOverlappingObjectInternal (btBroadphaseProxy otherProxy, btDispatcher dispatcher) {
		gdxBulletJNI.btPairCachingGhostObject_removeOverlappingObjectInternal__SWIG_1(swigCPtr, this,
			btBroadphaseProxy.getCPtr(otherProxy), otherProxy, btDispatcher.getCPtr(dispatcher), dispatcher);
	}

	public btHashedOverlappingPairCache getOverlappingPairCache () {
		long cPtr = gdxBulletJNI.btPairCachingGhostObject_getOverlappingPairCache(swigCPtr, this);
		return (cPtr == 0) ? null : new btHashedOverlappingPairCache(cPtr, false);
	}

}
