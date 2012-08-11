/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;

public class btCollisionWorld {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected btCollisionWorld (long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr (btCollisionWorld obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize () {
		delete();
	}

	public synchronized void delete () {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btCollisionWorld(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public btCollisionWorld (btDispatcher dispatcher, btBroadphaseInterface broadphasePairCache,
		btCollisionConfiguration collisionConfiguration) {
		this(gdxBulletJNI.new_btCollisionWorld(btDispatcher.getCPtr(dispatcher), dispatcher,
			btBroadphaseInterface.getCPtr(broadphasePairCache), broadphasePairCache,
			btCollisionConfiguration.getCPtr(collisionConfiguration), collisionConfiguration), true);
	}

	public void setBroadphase (btBroadphaseInterface pairCache) {
		gdxBulletJNI.btCollisionWorld_setBroadphase(swigCPtr, this, btBroadphaseInterface.getCPtr(pairCache), pairCache);
	}

	public btBroadphaseInterface getBroadphase () {
		long cPtr = gdxBulletJNI.btCollisionWorld_getBroadphase__SWIG_0(swigCPtr, this);
		return (cPtr == 0) ? null : new btBroadphaseInterface(cPtr, false);
	}

	public btOverlappingPairCache getPairCache () {
		long cPtr = gdxBulletJNI.btCollisionWorld_getPairCache(swigCPtr, this);
		return (cPtr == 0) ? null : new btOverlappingPairCache(cPtr, false);
	}

	public btDispatcher getDispatcher () {
		long cPtr = gdxBulletJNI.btCollisionWorld_getDispatcher__SWIG_0(swigCPtr, this);
		return (cPtr == 0) ? null : new btDispatcher(cPtr, false);
	}

	public void updateSingleAabb (btCollisionObject colObj) {
		gdxBulletJNI.btCollisionWorld_updateSingleAabb(swigCPtr, this, btCollisionObject.getCPtr(colObj), colObj);
	}

	public void updateAabbs () {
		gdxBulletJNI.btCollisionWorld_updateAabbs(swigCPtr, this);
	}

	public void setDebugDrawer (btIDebugDraw debugDrawer) {
		gdxBulletJNI.btCollisionWorld_setDebugDrawer(swigCPtr, this, btIDebugDraw.getCPtr(debugDrawer), debugDrawer);
	}

	public btIDebugDraw getDebugDrawer () {
		long cPtr = gdxBulletJNI.btCollisionWorld_getDebugDrawer(swigCPtr, this);
		return (cPtr == 0) ? null : new btIDebugDraw(cPtr, false);
	}

	public void debugDrawWorld () {
		gdxBulletJNI.btCollisionWorld_debugDrawWorld(swigCPtr, this);
	}

	public void debugDrawObject (btTransform worldTransform, btCollisionShape shape, Vector3 color) {
		gdxBulletJNI.btCollisionWorld_debugDrawObject(swigCPtr, this, btTransform.getCPtr(worldTransform), worldTransform,
			btCollisionShape.getCPtr(shape), shape, color);
	}

	public int getNumCollisionObjects () {
		return gdxBulletJNI.btCollisionWorld_getNumCollisionObjects(swigCPtr, this);
	}

	public void rayTest (Vector3 rayFromWorld, Vector3 rayToWorld, SWIGTYPE_p_btCollisionWorld__RayResultCallback resultCallback) {
		gdxBulletJNI.btCollisionWorld_rayTest(swigCPtr, this, rayFromWorld, rayToWorld,
			SWIGTYPE_p_btCollisionWorld__RayResultCallback.getCPtr(resultCallback));
	}

	public void convexSweepTest (btConvexShape castShape, btTransform from, btTransform to,
		SWIGTYPE_p_btCollisionWorld__ConvexResultCallback resultCallback, float allowedCcdPenetration) {
		gdxBulletJNI.btCollisionWorld_convexSweepTest__SWIG_0(swigCPtr, this, btConvexShape.getCPtr(castShape), castShape,
			btTransform.getCPtr(from), from, btTransform.getCPtr(to), to,
			SWIGTYPE_p_btCollisionWorld__ConvexResultCallback.getCPtr(resultCallback), allowedCcdPenetration);
	}

	public void convexSweepTest (btConvexShape castShape, btTransform from, btTransform to,
		SWIGTYPE_p_btCollisionWorld__ConvexResultCallback resultCallback) {
		gdxBulletJNI.btCollisionWorld_convexSweepTest__SWIG_1(swigCPtr, this, btConvexShape.getCPtr(castShape), castShape,
			btTransform.getCPtr(from), from, btTransform.getCPtr(to), to,
			SWIGTYPE_p_btCollisionWorld__ConvexResultCallback.getCPtr(resultCallback));
	}

	public void contactTest (btCollisionObject colObj, SWIGTYPE_p_btCollisionWorld__ContactResultCallback resultCallback) {
		gdxBulletJNI.btCollisionWorld_contactTest(swigCPtr, this, btCollisionObject.getCPtr(colObj), colObj,
			SWIGTYPE_p_btCollisionWorld__ContactResultCallback.getCPtr(resultCallback));
	}

	public void contactPairTest (btCollisionObject colObjA, btCollisionObject colObjB,
		SWIGTYPE_p_btCollisionWorld__ContactResultCallback resultCallback) {
		gdxBulletJNI.btCollisionWorld_contactPairTest(swigCPtr, this, btCollisionObject.getCPtr(colObjA), colObjA,
			btCollisionObject.getCPtr(colObjB), colObjB, SWIGTYPE_p_btCollisionWorld__ContactResultCallback.getCPtr(resultCallback));
	}

	public static void rayTestSingle (btTransform rayFromTrans, btTransform rayToTrans, btCollisionObject collisionObject,
		btCollisionShape collisionShape, btTransform colObjWorldTransform,
		SWIGTYPE_p_btCollisionWorld__RayResultCallback resultCallback) {
		gdxBulletJNI.btCollisionWorld_rayTestSingle(btTransform.getCPtr(rayFromTrans), rayFromTrans,
			btTransform.getCPtr(rayToTrans), rayToTrans, btCollisionObject.getCPtr(collisionObject), collisionObject,
			btCollisionShape.getCPtr(collisionShape), collisionShape, btTransform.getCPtr(colObjWorldTransform),
			colObjWorldTransform, SWIGTYPE_p_btCollisionWorld__RayResultCallback.getCPtr(resultCallback));
	}

	public static void objectQuerySingle (btConvexShape castShape, btTransform rayFromTrans, btTransform rayToTrans,
		btCollisionObject collisionObject, btCollisionShape collisionShape, btTransform colObjWorldTransform,
		SWIGTYPE_p_btCollisionWorld__ConvexResultCallback resultCallback, float allowedPenetration) {
		gdxBulletJNI.btCollisionWorld_objectQuerySingle(btConvexShape.getCPtr(castShape), castShape,
			btTransform.getCPtr(rayFromTrans), rayFromTrans, btTransform.getCPtr(rayToTrans), rayToTrans,
			btCollisionObject.getCPtr(collisionObject), collisionObject, btCollisionShape.getCPtr(collisionShape), collisionShape,
			btTransform.getCPtr(colObjWorldTransform), colObjWorldTransform,
			SWIGTYPE_p_btCollisionWorld__ConvexResultCallback.getCPtr(resultCallback), allowedPenetration);
	}

	public void addCollisionObject (btCollisionObject collisionObject, short collisionFilterGroup, short collisionFilterMask) {
		gdxBulletJNI.btCollisionWorld_addCollisionObject__SWIG_0(swigCPtr, this, btCollisionObject.getCPtr(collisionObject),
			collisionObject, collisionFilterGroup, collisionFilterMask);
	}

	public void addCollisionObject (btCollisionObject collisionObject, short collisionFilterGroup) {
		gdxBulletJNI.btCollisionWorld_addCollisionObject__SWIG_1(swigCPtr, this, btCollisionObject.getCPtr(collisionObject),
			collisionObject, collisionFilterGroup);
	}

	public void addCollisionObject (btCollisionObject collisionObject) {
		gdxBulletJNI.btCollisionWorld_addCollisionObject__SWIG_2(swigCPtr, this, btCollisionObject.getCPtr(collisionObject),
			collisionObject);
	}

	public btCollisionObjectArray getCollisionObjectArray () {
		return new btCollisionObjectArray(gdxBulletJNI.btCollisionWorld_getCollisionObjectArray__SWIG_0(swigCPtr, this), false);
	}

	public void removeCollisionObject (btCollisionObject collisionObject) {
		gdxBulletJNI.btCollisionWorld_removeCollisionObject(swigCPtr, this, btCollisionObject.getCPtr(collisionObject),
			collisionObject);
	}

	public void performDiscreteCollisionDetection () {
		gdxBulletJNI.btCollisionWorld_performDiscreteCollisionDetection(swigCPtr, this);
	}

	public btDispatcherInfo getDispatchInfo () {
		return new btDispatcherInfo(gdxBulletJNI.btCollisionWorld_getDispatchInfo__SWIG_0(swigCPtr, this), false);
	}

	public boolean getForceUpdateAllAabbs () {
		return gdxBulletJNI.btCollisionWorld_getForceUpdateAllAabbs(swigCPtr, this);
	}

	public void setForceUpdateAllAabbs (boolean forceUpdateAllAabbs) {
		gdxBulletJNI.btCollisionWorld_setForceUpdateAllAabbs(swigCPtr, this, forceUpdateAllAabbs);
	}

	public void serialize (SWIGTYPE_p_btSerializer serializer) {
		gdxBulletJNI.btCollisionWorld_serialize(swigCPtr, this, SWIGTYPE_p_btSerializer.getCPtr(serializer));
	}

}
