title GIT �����B�z�X�X�Q�p��
@echo off
echo *************************************************************
echo *                GIT �N�X�����B�z                         *
echo *  Author: �Q�p��                                           *
echo *  Version: 1.0                                             *
echo *  Created: 2017/3/26                                       *
echo *  Last Updated by: �Q�p��                                  *
echo *************************************************************

echo;
echo;

echo �}�l����N�X�쥻�a�ܮw
echo ��e�ؿ��O�G%cd%

echo;
echo;
echo �}�l�ѧO��egit������
echo ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
git --version
echo ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
echo;
echo;

echo �}�l�K�[�ܧ�
echo ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
git add -A .
echo ���浲���I
echo ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

echo;
echo;
echo;
echo;
echo;
echo;
echo;
echo;
echo �����ܧ�쥻�a�ܮw
echo ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
@echo off
set /p var=�п�J���满��: 
echo;
echo �z��J�����满�����G  %var%
echo;
git commit -m %var%
echo ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

echo;
echo;
echo;
echo;
echo;
echo;
echo;
echo;
echo �N�ܧ󱡪p����컷�{git�A�Ⱦ�
echo ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
git push origin master
echo ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

echo;
echo ��B�z���槹���I
echo;

pause